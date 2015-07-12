package cordova.plugin.rongcloud.im;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.widget.Toast;

import java.io.File;

public class ConversationActivity extends ActionBarActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getApplicationContext().getResources()
                .getIdentifier("conversation", "layout", getApplicationContext().getPackageName()));
        getSupportActionBar().setTitle("会话");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(getApplicationContext().getResources()
                .getIdentifier("im_actionbar_back", "drawable", getApplicationContext().getPackageName()));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
