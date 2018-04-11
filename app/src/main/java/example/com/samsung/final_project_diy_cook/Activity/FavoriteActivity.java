package example.com.samsung.final_project_diy_cook.Activity;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import example.com.samsung.final_project_diy_cook.R;

public class FavoriteActivity extends AppCompatActivity {

    private String[] values = {"apple", "Apritcot", "banana"};
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);

        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.android.R.layout.simple_list_item_1, values);

        //listView = findViewById(R.id.favorite_listview);

        //listView.setAdapter(adapter);

        FavortieItem adapter = new FavortieItem(FavoriteActivity.this);
        listView = (findViewById(R.id.favorite_listview));
        listView.setAdapter(adapter);


    }
    public class FavortieItem extends ArrayAdapter<String>{
        private final Activity context;
        public FavortieItem(Activity context){
            super(context, R.layout.favorite_item, values);
            this.context = context;
        }



        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            LayoutInflater inflater = context.getLayoutInflater();
            View rowView = inflater.inflate(R.layout.favorite_item, null, true);
            ImageView imageView = (ImageView)rowView.findViewById(R.id.imageView);
//            TextView title = (TextView)rowView.findViewById()

            return super.getView(position, convertView, parent);
        }

    }





}
