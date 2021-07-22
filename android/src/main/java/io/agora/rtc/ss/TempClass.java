package io.agora.rtc.ss;

import android.util.Log;
import android.content.Context;
import android.content.ServiceConnection;
import io.agora.rtc.ss.ScreenSharingClient;

public class TempClass extends ScreenSharingClient{

    public static Context mContext;

    public static Context getContext(){
        return mContext;
    }
    
    public static void sendContext(Context context){
        mContext = context;
    }

    public final ScreenSharingClient.IStateListener createListener(ScreenSharingClient client, String token){
        final ScreenSharingClient mSSClient = client;
        final String agToken = token;
        ScreenSharingClient.IStateListener mListener = new ScreenSharingClient.IStateListener() {
            @Override
            public void onError(int error) {
                //Log.e("Screen share service error happened: " + error);
            }

            @Override
            public void onTokenWillExpire() {
                //Log.d("Screen share service token will expire");
                mSSClient.renewToken(agToken); // Replace the token with your valid token
            }
        };
        return mListener;
    }
} 