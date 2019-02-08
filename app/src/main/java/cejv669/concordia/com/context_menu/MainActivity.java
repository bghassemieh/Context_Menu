package cejv669.concordia.com.context_menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = findViewById(R.id.btn_1);
        Button b2 = findViewById(R.id.btn_2);

        registerForContextMenu(b1);
        registerForContextMenu(b2);

        }

        @Override
        public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
            super.onCreateContextMenu(menu, v, menuInfo); menu.setHeaderTitle("Context Menu");
            if (v.getId() == R.id.btn_1){
                menu.setHeaderTitle("Context Menu");
                menu.add(0, v.getId(), 0, "A");
                menu.add(1, v.getId(), 0, "B");
            }
            else{
                menu.setHeaderTitle("Context Menu");
                menu.add(0, v.getId(), 0, "Red");
                menu.add(1, v.getId(), 0, "Blue");

            }
        }
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if(item.getItemId()== R.id.btn_1){

        }
        if(item.getItemId() == R.id.btn_2){

        }
        return true;
    }
}
