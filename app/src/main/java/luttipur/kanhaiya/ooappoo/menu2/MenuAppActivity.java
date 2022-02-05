package luttipur.kanhaiya.ooappoo.menu2;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MenuAppActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu,menu);

        // return super.onCreateOptionsMenu(menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();

        if (itemId == R.id.hom)
            Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show();

        else if (itemId == R.id.cal)
            Toast.makeText(this, "Call", Toast.LENGTH_SHORT).show();

        else if (itemId == R.id.cam){
            Toast.makeText(this, "Camera", Toast.LENGTH_SHORT).show();
       }

        else if (itemId == R.id.setting){
            startActivity(new Intent(this,SettingMenuActivity.class));
        }

        else if (itemId == R.id.search){
            Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show();
       }

        else if (itemId == R.id.edit){
            Toast.makeText(this, "Edit", Toast.LENGTH_SHORT).show();
       }

        return super.onOptionsItemSelected(item);
    }

}
