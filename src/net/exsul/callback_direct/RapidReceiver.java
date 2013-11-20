package net.exsul.callback_direct;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

public class RapidReceiver extends BroadcastReceiver {
    public void onReceive( final Context context, final Intent i ) {
        if (!i.getAction().equals("net.exsul.callback2.make_callback"))
            return;
        final Bundle b = i.getExtras();
        if (b == null)
            return;
        final String uri = b.getString("URI");

        final Intent intent = new Intent(Intent.ACTION_CALL);

        intent.setData(Uri.parse(uri));
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        context.startActivity(intent);
    }
}
