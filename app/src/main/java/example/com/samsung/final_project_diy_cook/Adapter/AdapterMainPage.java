package example.com.samsung.final_project_diy_cook.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

import example.com.samsung.final_project_diy_cook.Classes.Recipe;

/**
 * Created by samsung on 4/11/2018.
 */

public class AdapterMainPage extends BaseAdapter {
    private Context context;
    private List<Recipe> recipeList;

    public AdapterMainPage(Context context, List<Recipe> recipeList){
        this.context = context;
        this.recipeList = recipeList;
    }

    @Override
    public int getCount() {return recipeList.size();}

    @Override
    public Object getItem(int position) {return recipeList.get(position);}

    @Override
    public long getItemId(int position) {return position;}

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
