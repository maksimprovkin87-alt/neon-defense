package com.neondefense.game;
import android.app.Activity; import android.os.Bundle; import android.webkit.WebView; import android.webkit.WebSettings;
public class MainActivity extends Activity {
 @Override public void onCreate(Bundle b){super.onCreate(b); WebView w=new WebView(this); WebSettings s=w.getSettings(); s.setJavaScriptEnabled(true); s.setDomStorageEnabled(true); w.setOverScrollMode(WebView.OVER_SCROLL_NEVER); setContentView(w); w.loadUrl("file:///android_asset/index.html");}
 @Override public void onBackPressed(){super.onBackPressed();}
}
