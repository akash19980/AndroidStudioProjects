package com.example.lenovo.telephonymanager;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.TelecomManager;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.text.style.TtsSpan;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Locale;
import java.util.Queue;

import static java.util.Locale.US;

public class MainActivity extends AppCompatActivity implements TextToSpeech.OnInitListener {
TextToSpeech t1;
Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);
t1=new TextToSpeech(this,this);
b1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        t1.speak("SAy somethingggggggggggggggggggggggggggggggggggggggggggggggg", TextToSpeech.QUEUE_FLUSH,null);
    }
});
        TelephonyManager telephone=(TelephonyManager)getSystemService(Context.TELEPHONY_SERVICE);
        PhoneStateListener calllistener = new PhoneStateListener(){
            @Override
            public void onCallStateChanged(int state, String phoneNumber) {
                //Toast.makeText(MainActivity.this, state+"        ", Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, state+"        ", Toast.LENGTH_SHORT).show();

           if(state==TelephonyManager.CALL_STATE_RINGING)
           {
               t1.speak(phoneNumber+"CALLING",TextToSpeech.QUEUE_FLUSH,null);
               Toast.makeText(MainActivity.this, "PHone ringing", Toast.LENGTH_SHORT).show();
           }

           if(state==TelephonyManager.CALL_STATE_IDLE)
           {
               t1.speak("PHone band pea hai ",TextToSpeech.QUEUE_FLUSH,null);
               Toast.makeText(MainActivity.this, "PHone ISIDL", Toast.LENGTH_SHORT).show();
           }
                       }
        };
        telephone.listen(calllistener,PhoneStateListener.LISTEN_CALL_STATE);
    }

    @Override
    public void onInit(int i) {
        if(i==TextToSpeech.SUCCESS)
        {
            int result=t1.setLanguage(Locale.US);

        }
    }

}
