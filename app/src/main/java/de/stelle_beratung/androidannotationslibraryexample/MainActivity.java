package de.stelle_beratung.androidannotationslibraryexample;

import android.app.Activity;

import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EActivity;

import de.stelle_beratung.mylibrary.RandomController;

@EActivity(R.layout.activity_main)
public class MainActivity extends Activity {
    
    @Bean
    RandomController mController;

}
