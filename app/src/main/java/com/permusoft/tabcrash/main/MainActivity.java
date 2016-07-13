package com.permusoft.tabcrash.main;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.permusoft.tabcrash.R;

public class MainActivity extends AppCompatActivity {
   public static final String tag = "Main Activity";


   @Override
   public void onCreate(Bundle state) {
      super.onCreate(state);
      setContentView(R.layout.main_activity);

      Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
      toolbar.setTitle(R.string.tab_crash);
      setSupportActionBar(toolbar);

      TabLayout tabLayout = (TabLayout)findViewById(R.id.tabLayout);
      tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
      tabLayout.addOnTabSelectedListener(new MainTabSelectedListener());
      tabLayout.addTab(tabLayout.newTab().setText("Kaboom"));
   }


   private class MainTabSelectedListener implements TabLayout.OnTabSelectedListener {
      @Override
      public void onTabSelected(TabLayout.Tab tab) {
         Log.i(tag, String.format("Selected %s tab.", tab.getText()));
      }

      @Override
      public void onTabUnselected(TabLayout.Tab tab) {
         Log.i(tag, String.format("Unselected %s tab.", tab.getText())); // Kaboom
      }

      @Override
      public void onTabReselected(TabLayout.Tab tab) {
         Log.i(tag, String.format("Reselected %s tab.", tab.getText()));
      }
   }

}



