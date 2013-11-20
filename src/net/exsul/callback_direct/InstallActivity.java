package net.exsul.callback_direct;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.Toast;

public class InstallActivity extends Activity {

    @Override
    public void onCreate( final Bundle saved ) {
        super.onCreate(saved);
        hideFromMenu();
        Toast.makeText((Context)this, "Дополнение установлено", Toast.LENGTH_LONG).show();
        finish();
    }

    private void hideFromMenu() {
        ComponentName cn = new ComponentName("net.exsul.callback_direct", "net.exsul.callback_direct.InstallActivity");
        getPackageManager().setComponentEnabledSetting(cn, PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
    }

}
