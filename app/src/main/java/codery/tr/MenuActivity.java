package codery.tr;

import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.*;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.os.Bundle;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.FirebaseApp;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.*;
import org.json.*;

public class MenuActivity extends AppCompatActivity {
	
	private FloatingActionButton _fab;
	private HashMap<String, Object> map = new HashMap<>();
	private String projeismi = "";
	
	private ArrayList<HashMap<String, Object>> lm = new ArrayList<>();
	
	private LinearLayout linear1;
	private TextView textview6;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private LinearLayout linear6;
	private TextView textview1;
	private LinearLayout linear7;
	private GridView gridview1;
	private LinearLayout linear10;
	private LinearLayout linear9;
	private LinearLayout linearkod;
	private LinearLayout linear13;
	private LinearLayout linear14;
	private TextView textview2;
	private ImageView imageview1;
	private TextView textview3;
	private ImageView imageview2;
	private LinearLayout linear12;
	private TextView textview4;
	private ImageView imageview3;
	private TextView textview5;
	
	private Intent intent = new Intent();
	private SharedPreferences sp;
	private AlertDialog.Builder dialog;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.menu);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		_fab = findViewById(R.id._fab);
		linear1 = findViewById(R.id.linear1);
		textview6 = findViewById(R.id.textview6);
		linear2 = findViewById(R.id.linear2);
		linear3 = findViewById(R.id.linear3);
		linear4 = findViewById(R.id.linear4);
		linear6 = findViewById(R.id.linear6);
		textview1 = findViewById(R.id.textview1);
		linear7 = findViewById(R.id.linear7);
		gridview1 = findViewById(R.id.gridview1);
		linear10 = findViewById(R.id.linear10);
		linear9 = findViewById(R.id.linear9);
		linearkod = findViewById(R.id.linearkod);
		linear13 = findViewById(R.id.linear13);
		linear14 = findViewById(R.id.linear14);
		textview2 = findViewById(R.id.textview2);
		imageview1 = findViewById(R.id.imageview1);
		textview3 = findViewById(R.id.textview3);
		imageview2 = findViewById(R.id.imageview2);
		linear12 = findViewById(R.id.linear12);
		textview4 = findViewById(R.id.textview4);
		imageview3 = findViewById(R.id.imageview3);
		textview5 = findViewById(R.id.textview5);
		sp = getSharedPreferences("proje", Activity.MODE_PRIVATE);
		dialog = new AlertDialog.Builder(this);
		
		textview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), ProjelerActivity.class);
				startActivity(intent);
			}
		});
		
		gridview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				
			}
		});
		
		imageview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), KodstoreActivity.class);
				startActivity(intent);
			}
		});
		
		imageview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), ProjelerActivity.class);
				startActivity(intent);
			}
		});
		
		_fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), OlusturActivity.class);
				startActivity(intent);
			}
		});
	}
	
	private void initializeLogic() {
		lm = new Gson().fromJson("[\n  {\n    \"title\": \"Basit Buton Animasyonu\",\n    \"code\": \"<button id='btn'>Tıkla</button><style>#btn{padding:10px 20px;border:none;background:tomato;color:#fff;transition:.3s;}#btn:hover{transform:scale(1.1);background:#ff6b6b;}</style>\"\n  },\n  {\n    \"title\": \"Kararan Arkaplan\",\n    \"code\": \"<div id='bg'></div><style>#bg{width:100%;height:100vh;background:#3498db;transition:.5s;}#bg:hover{background:#2c3e50;}</style>\"\n  },\n  {\n    \"title\": \"Yazı Yazınca Renk Değişen Input\",\n    \"code\": \"<input id='inp' placeholder='Yaz...'><script>inp.oninput=()=>inp.style.background=inp.value?'#d1ffd1':'#fff';</script>\"\n  },\n  {\n    \"title\": \"Saat Gösterici\",\n    \"code\": \"<div id='saat'></div><script>setInterval(()=>{saat.innerHTML=new Date().toLocaleTimeString();},1000);</script><style>#saat{font-size:30px;font-weight:bold;}</style>\"\n  },\n  {\n    \"title\": \"Kayan Yazı\",\n    \"code\": \"<marquee>Hızlı Kod!</marquee>\"\n  },\n  {\n    \"title\": \"Tıklayınca Kutu Oluşturan Script\",\n    \"code\": \"<button onclick='ekle()'>Kutu Ekle</button><div id='kutuAlani'></div><script>function ekle(){let d=document.createElement('div');d.style.width='60px';d.style.height='60px';d.style.background='purple';d.style.margin='5px';kutuAlani.appendChild(d);}</script>\"\n  }\n]", new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
		gridview1.setAdapter(new Gridview1Adapter(lm));
		gridview1.setNumColumns((int)3);
		gridview1.setColumnWidth((int)0);
		_RoundAndBorder(linearkod, "#263238", 2, "#000000", 40);
	}
	
	@Override
	public void onStart() {
		super.onStart();
		
	}
	public void _RoundAndBorder(final View _view, final String _color1, final double _border, final String _color2, final double _round) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
		gd.setColor(Color.parseColor(_color1));
		gd.setCornerRadius((int) _round);
		gd.setStroke((int) _border, Color.parseColor(_color2));
		_view.setBackground(gd);
	}
	
	public class Gridview1Adapter extends BaseAdapter {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Gridview1Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public int getCount() {
			return _data.size();
		}
		
		@Override
		public HashMap<String, Object> getItem(int _index) {
			return _data.get(_index);
		}
		
		@Override
		public long getItemId(int _index) {
			return _index;
		}
		
		@Override
		public View getView(final int _position, View _v, ViewGroup _container) {
			LayoutInflater _inflater = getLayoutInflater();
			View _view = _v;
			if (_view == null) {
				_view = _inflater.inflate(R.layout.menugrid, null);
			}
			
			final LinearLayout linear1 = _view.findViewById(R.id.linear1);
			final ImageView imageview1 = _view.findViewById(R.id.imageview1);
			final TextView textview1 = _view.findViewById(R.id.textview1);
			
			textview1.setText(lm.get((int)_position).get("title").toString());
			_RoundAndBorder(linear1, "#263238", 0, "#FFFFFF", 35);
			
			return _view;
		}
	}
}