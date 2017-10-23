package edu.webfutuandroid.ing26sistemas.gamescenral.view;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

import butterknife.ButterKnife;
import edu.webfutuandroid.ing26sistemas.gamescenral.R;
import edu.webfutuandroid.ing26sistemas.gamescenral.view.fragment.HomeFragment;
import edu.webfutuandroid.ing26sistemas.gamescenral.view.fragment.NewsFragment;
import edu.webfutuandroid.ing26sistemas.gamescenral.view.fragment.TournamentsFragment;

import static edu.webfutuandroid.ing26sistemas.gamescenral.R.id.bottonbar;

public class ContainerActivity extends AppCompatActivity {

    HomeFragment homeFragment;
    NewsFragment newsFragment;
    TournamentsFragment tournamentsFragment;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);
        ButterKnife.bind(this);

        //showToolbar(getResources().getString(R.string.toolbar_tittle_scenarios), false);


        BottomBar bottomBar = (BottomBar) findViewById(bottonbar);
        bottomBar.setDefaultTab(R.id.home);

        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                switch (tabId){
                    case R.id.home:
                        HomeFragment homeFragment = new HomeFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, homeFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null).commit();

                        break;
                    case R.id.news:
                        NewsFragment newsFragment = new NewsFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, newsFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null).commit();
                        break;
                    case R.id.competitions:
                        TournamentsFragment tournamentsFragment = new TournamentsFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, tournamentsFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null).commit();
                        break;
                }
            }
        });



    }

    /*
    public void showToolbar(String tittle, boolean upButton) {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(tittle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);

    }
    */

}
