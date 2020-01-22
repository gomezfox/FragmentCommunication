package edu.cascadia.brianb.fragmentcommunication;

import androidx.appcompat.app.AppCompatActivity;
//import androidx.fragment.app.FragmentManager;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ItemFragment.OnFragmentInteractionListener {
//DONE: require the Activity to implement the interface 'OnFragmentInteractionListener'
    FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TODO: Add the ItemFragment to the Activity layout's fragment container
        // HINT: Use the getFragmentManager to begin a transaction, add, and commit
        fm = getFragmentManager();


        Fragment frag = new ItemFragment()
        fm.beginTransaction()
        .add(ItemFragment);


        

    }

    //TODO: Implement the method 'onFragmentInteraction' to creates a new SimpleFragment
    //      using its FragmentFactory method 'newInstance'
    @Override
    public void onFragmentInteraction(String str) {
        SimpleFragment sf = SimpleFragment.newInstance(str);
        fm.beginTransaction()
                .attach(sf)
                .addToBackStack(null)
                .commit();
    }
}
