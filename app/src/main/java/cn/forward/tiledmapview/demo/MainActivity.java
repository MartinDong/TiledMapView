package cn.forward.tiledmapview.demo;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.squareup.picasso.LruCache;
import com.squareup.picasso.Picasso;

import cn.forward.tiledmapview.BuildConfig;
import cn.forward.tiledmapview.TiledMapView;
import cn.forward.tiledmapview.demo.lol.LolMapDemoActivity;

import static android.content.pm.ApplicationInfo.FLAG_LARGE_HEAP;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TiledMapView.openLog(BuildConfig.DEBUG);
    }

    @Override
    protected void onResume() {
        super.onResume();
        TiledMapView.setDebugMode(false);
    }

    public void openGoogle(View view) {
        Intent intent = new Intent(this, TiledMapDemoActivity.class);
        intent.putExtra(TiledMapDemoActivity.TYPE, TileType.Google);
        startActivity(intent);
    }

    public void openTianditu(View view) {
        Intent intent = new Intent(this, TiledMapDemoActivity.class);
        intent.putExtra(TiledMapDemoActivity.TYPE, TileType.Tianditu);
        startActivity(intent);
    }

    public void openLol(View view) {
        Intent intent = new Intent(this, LolMapDemoActivity.class);
        startActivity(intent);
    }
}
