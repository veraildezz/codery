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
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ValueEventListener;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.util.*;
import java.util.HashMap;
import java.util.regex.*;
import org.json.*;

public class ProjeActivity extends AppCompatActivity {
	
	private FirebaseDatabase _firebase = FirebaseDatabase.getInstance();
	
	private String html = "";
	private String css = "";
	private String js = "";
	private HashMap<String, Object> map = new HashMap<>();
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear30;
	private HorizontalScrollView hscroll_symbols;
	private TextView textview175;
	private ImageView imageview5;
	private ImageView imageview6;
	private LinearLayout linearhtmlicon;
	private LinearLayout linearcssicon;
	private LinearLayout linearjsicon;
	private ImageView imageview2;
	private TextView textview4;
	private ImageView imageview3;
	private TextView textview5;
	private ImageView imageview4;
	private TextView textview6;
	private LinearLayout linear4;
	private LinearLayout linear_console_output;
	private HorizontalScrollView hscroll10;
	private LinearLayout linear31;
	private ScrollView vscroll1;
	private LinearLayout linear9;
	private LinearLayout linearhtml;
	private LinearLayout linearcss;
	private LinearLayout linearjs;
	private EditText edittext1;
	private EditText edittext2;
	private EditText edittext3;
	private TextView textview_console_title;
	private ScrollView vscroll26;
	private TextView textview_console_content;
	private LinearLayout linear5;
	private TextView textview7;
	private TextView textview8;
	private TextView textview9;
	private TextView textview10;
	private TextView textview11;
	private TextView textview12;
	private TextView textview13;
	private TextView textview14;
	private TextView textview16;
	private TextView textview15;
	private TextView textview17;
	private TextView textview18;
	private TextView textview170;
	private TextView textview171;
	private TextView textview172;
	private TextView textview173;
	private TextView textview174;
	
	private Intent i = new Intent();
	private RequestNetwork rqe;
	private RequestNetwork.RequestListener _rqe_request_listener;
	private AlertDialog.Builder dialog;
	private DatabaseReference fdb = _firebase.getReference("local/");
	private ChildEventListener _fdb_child_listener;
	private SharedPreferences sp;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.proje);
		initialize(_savedInstanceState);
		FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		linear2 = findViewById(R.id.linear2);
		linear3 = findViewById(R.id.linear3);
		linear30 = findViewById(R.id.linear30);
		hscroll_symbols = findViewById(R.id.hscroll_symbols);
		textview175 = findViewById(R.id.textview175);
		imageview5 = findViewById(R.id.imageview5);
		imageview6 = findViewById(R.id.imageview6);
		linearhtmlicon = findViewById(R.id.linearhtmlicon);
		linearcssicon = findViewById(R.id.linearcssicon);
		linearjsicon = findViewById(R.id.linearjsicon);
		imageview2 = findViewById(R.id.imageview2);
		textview4 = findViewById(R.id.textview4);
		imageview3 = findViewById(R.id.imageview3);
		textview5 = findViewById(R.id.textview5);
		imageview4 = findViewById(R.id.imageview4);
		textview6 = findViewById(R.id.textview6);
		linear4 = findViewById(R.id.linear4);
		linear_console_output = findViewById(R.id.linear_console_output);
		hscroll10 = findViewById(R.id.hscroll10);
		linear31 = findViewById(R.id.linear31);
		vscroll1 = findViewById(R.id.vscroll1);
		linear9 = findViewById(R.id.linear9);
		linearhtml = findViewById(R.id.linearhtml);
		linearcss = findViewById(R.id.linearcss);
		linearjs = findViewById(R.id.linearjs);
		edittext1 = findViewById(R.id.edittext1);
		edittext2 = findViewById(R.id.edittext2);
		edittext3 = findViewById(R.id.edittext3);
		textview_console_title = findViewById(R.id.textview_console_title);
		vscroll26 = findViewById(R.id.vscroll26);
		textview_console_content = findViewById(R.id.textview_console_content);
		linear5 = findViewById(R.id.linear5);
		textview7 = findViewById(R.id.textview7);
		textview8 = findViewById(R.id.textview8);
		textview9 = findViewById(R.id.textview9);
		textview10 = findViewById(R.id.textview10);
		textview11 = findViewById(R.id.textview11);
		textview12 = findViewById(R.id.textview12);
		textview13 = findViewById(R.id.textview13);
		textview14 = findViewById(R.id.textview14);
		textview16 = findViewById(R.id.textview16);
		textview15 = findViewById(R.id.textview15);
		textview17 = findViewById(R.id.textview17);
		textview18 = findViewById(R.id.textview18);
		textview170 = findViewById(R.id.textview170);
		textview171 = findViewById(R.id.textview171);
		textview172 = findViewById(R.id.textview172);
		textview173 = findViewById(R.id.textview173);
		textview174 = findViewById(R.id.textview174);
		rqe = new RequestNetwork(this);
		dialog = new AlertDialog.Builder(this);
		sp = getSharedPreferences("proje", Activity.MODE_PRIVATE);
		
		imageview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				html = edittext1.getText().toString();
				css = edittext2.getText().toString();
				js = edittext3.getText().toString();
				dialog.setTitle("Proje");
				dialog.setMessage("Projenizi herkese açık yapmak ister misiniz?");
				dialog.setPositiveButton("Kaydet", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						map = new HashMap<>();
						map.put("html", html);
						map.put("css", css);
						map.put("js", js);
						map.put("baslik", textview175.getText().toString());
						map.put("dil", "html css js");
						fdb.push().updateChildren(map);
						textview_console_content.setText("Başarıyla Paylaşıldı.");
					}
				});
				dialog.setNegativeButton("Local", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						textview_console_content.setText("İptal Edildi");
					}
				});
				//Code generated by App Designer
				{
					final AlertDialog alert = dialog.show();
					DisplayMetrics screen = new DisplayMetrics();
					getWindowManager().getDefaultDisplay().getMetrics(screen);
					double dp = 24;
					double logicalDensity = screen.density;
					int px = (int) Math.ceil(dp * logicalDensity);
					alert.getWindow().getDecorView().setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)px, Color.parseColor("#424242")));
					alert.getWindow().getDecorView().setPadding(8,8,8,8);
					alert.show();
					
					alert.getButton(AlertDialog.BUTTON_POSITIVE).setTextColor(Color.parseColor("#FAFAFA"));
					alert.getButton(AlertDialog.BUTTON_NEGATIVE).setTextColor(Color.parseColor("#FAFAFA"));
					alert.getButton(AlertDialog.BUTTON_NEUTRAL).setTextColor(Color.parseColor("#FAFAFA"));
					alert.getWindow().setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL);
					alert.getWindow().getDecorView().setTranslationY(-20);
					TextView textT = (TextView)alert.getWindow().getDecorView().findViewById(android.R.id.message);
					textT.setTextColor(Color.parseColor("#FAFAFA"));
					
					int titleId = getResources().getIdentifier( "alertTitle", "id", "android" ); 
					
					if (titleId > 0) { 
						TextView dialogTitle = (TextView) alert.getWindow().getDecorView().findViewById(titleId); 
						
						if (dialogTitle != null) {
							dialogTitle.setTextColor(Color.parseColor("#FAFAFA"));
						} 
					}}
			}
		});
		
		imageview6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), CompilerActivity.class);
				i.putExtra("kod", edittext1.getText().toString().concat("<style>".concat(edittext2.getText().toString().concat("</style>".concat("<script>".concat(edittext3.getText().toString().concat("</script>")))))));
				startActivity(i);
			}
		});
		
		linearhtmlicon.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linearhtmlicon.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFF616161));
				linearcssicon.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)0, Color.TRANSPARENT));
				linearjsicon.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)0, Color.TRANSPARENT));
				linearhtml.setVisibility(View.VISIBLE);
				linearcss.setVisibility(View.GONE);
				linearjs.setVisibility(View.GONE);
			}
		});
		
		linearcssicon.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linearhtmlicon.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)0, Color.TRANSPARENT));
				linearcssicon.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFF616161));
				linearjsicon.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)0, Color.TRANSPARENT));
				linearhtml.setVisibility(View.GONE);
				linearcss.setVisibility(View.VISIBLE);
				linearjs.setVisibility(View.GONE);
			}
		});
		
		linearjsicon.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linearhtmlicon.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)0, Color.TRANSPARENT));
				linearcssicon.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)0, Color.TRANSPARENT));
				linearjsicon.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFF616161));
				linearhtml.setVisibility(View.GONE);
				linearcss.setVisibility(View.GONE);
				linearjs.setVisibility(View.VISIBLE);
			}
		});
		
		textview7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (linearhtml.getVisibility() == View.VISIBLE) {
					edittext1.setText(edittext1.getText().toString().concat(" \" \""));
				} else {
					if (linearcss.getVisibility() == View.VISIBLE) {
						edittext2.setText(edittext2.getText().toString().concat(" \" \""));
					} else {
						if (linearjs.getVisibility() == View.VISIBLE) {
							edittext3.setText(edittext3.getText().toString().concat(" \" \""));
						} else {
							SketchwareUtil.showMessage(getApplicationContext(), "Hata");
						}
					}
				}
			}
		});
		
		textview8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (linearhtml.getVisibility() == View.VISIBLE) {
					edittext1.setText(edittext1.getText().toString().concat(";"));
				} else {
					if (linearcss.getVisibility() == View.VISIBLE) {
						edittext2.setText(edittext2.getText().toString().concat(";"));
					} else {
						if (linearjs.getVisibility() == View.VISIBLE) {
							edittext3.setText(edittext3.getText().toString().concat(";"));
						} else {
							SketchwareUtil.showMessage(getApplicationContext(), "Hata");
						}
					}
				}
			}
		});
		
		textview9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (linearhtml.getVisibility() == View.VISIBLE) {
					edittext1.setText(edittext1.getText().toString().concat(" ( )"));
				} else {
					if (linearcss.getVisibility() == View.VISIBLE) {
						edittext2.setText(edittext2.getText().toString().concat("( )"));
					} else {
						if (linearjs.getVisibility() == View.VISIBLE) {
							edittext3.setText(edittext3.getText().toString().concat("( )"));
						} else {
							SketchwareUtil.showMessage(getApplicationContext(), "Hata");
						}
					}
				}
			}
		});
		
		textview10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (linearhtml.getVisibility() == View.VISIBLE) {
					edittext1.setText(edittext1.getText().toString().concat(" { }"));
				} else {
					if (linearcss.getVisibility() == View.VISIBLE) {
						edittext2.setText(edittext2.getText().toString().concat("{ }"));
					} else {
						if (linearjs.getVisibility() == View.VISIBLE) {
							edittext3.setText(edittext3.getText().toString().concat("{ }"));
						} else {
							SketchwareUtil.showMessage(getApplicationContext(), "Hata");
						}
					}
				}
			}
		});
		
		textview11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (linearhtml.getVisibility() == View.VISIBLE) {
					edittext1.setText(edittext1.getText().toString().concat(" ="));
				} else {
					if (linearcss.getVisibility() == View.VISIBLE) {
						edittext2.setText(edittext2.getText().toString().concat(" ="));
					} else {
						if (linearjs.getVisibility() == View.VISIBLE) {
							edittext3.setText(edittext3.getText().toString().concat(" ="));
						} else {
							SketchwareUtil.showMessage(getApplicationContext(), "Hata");
						}
					}
				}
			}
		});
		
		textview12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (linearhtml.getVisibility() == View.VISIBLE) {
					edittext1.setText(edittext1.getText().toString().concat(" ' '"));
				} else {
					if (linearcss.getVisibility() == View.VISIBLE) {
						edittext2.setText(edittext2.getText().toString().concat(" ' '"));
					} else {
						if (linearjs.getVisibility() == View.VISIBLE) {
							edittext3.setText(edittext3.getText().toString().concat(" ' '"));
						} else {
							SketchwareUtil.showMessage(getApplicationContext(), "Hata");
						}
					}
				}
			}
		});
		
		textview13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (linearhtml.getVisibility() == View.VISIBLE) {
					edittext1.setText(edittext1.getText().toString().concat(" ."));
				} else {
					if (linearcss.getVisibility() == View.VISIBLE) {
						edittext2.setText(edittext2.getText().toString().concat(" ."));
					} else {
						if (linearjs.getVisibility() == View.VISIBLE) {
							edittext3.setText(edittext3.getText().toString().concat(" ."));
						} else {
							SketchwareUtil.showMessage(getApplicationContext(), "Hata");
						}
					}
				}
			}
		});
		
		textview14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (linearhtml.getVisibility() == View.VISIBLE) {
					edittext1.setText(edittext1.getText().toString().concat(" @"));
				} else {
					if (linearcss.getVisibility() == View.VISIBLE) {
						edittext2.setText(edittext2.getText().toString().concat(" @"));
					} else {
						if (linearjs.getVisibility() == View.VISIBLE) {
							edittext3.setText(edittext3.getText().toString().concat(" @"));
						} else {
							SketchwareUtil.showMessage(getApplicationContext(), "Hata");
						}
					}
				}
			}
		});
		
		textview16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (linearhtml.getVisibility() == View.VISIBLE) {
					edittext1.setText(edittext1.getText().toString().concat(" <"));
				} else {
					if (linearcss.getVisibility() == View.VISIBLE) {
						edittext2.setText(edittext2.getText().toString().concat(" <"));
					} else {
						if (linearjs.getVisibility() == View.VISIBLE) {
							edittext3.setText(edittext3.getText().toString().concat(" <"));
						} else {
							SketchwareUtil.showMessage(getApplicationContext(), "Hata");
						}
					}
				}
			}
		});
		
		textview15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (linearhtml.getVisibility() == View.VISIBLE) {
					edittext1.setText(edittext1.getText().toString().concat(">"));
				} else {
					if (linearcss.getVisibility() == View.VISIBLE) {
						edittext2.setText(edittext2.getText().toString().concat(">"));
					} else {
						if (linearjs.getVisibility() == View.VISIBLE) {
							edittext3.setText(edittext3.getText().toString().concat(" >"));
						} else {
							SketchwareUtil.showMessage(getApplicationContext(), "Hata");
						}
					}
				}
			}
		});
		
		textview17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (linearhtml.getVisibility() == View.VISIBLE) {
					edittext1.setText(edittext1.getText().toString().concat(" [ ]"));
				} else {
					if (linearcss.getVisibility() == View.VISIBLE) {
						edittext2.setText(edittext2.getText().toString().concat(" [ ]"));
					} else {
						if (linearjs.getVisibility() == View.VISIBLE) {
							edittext3.setText(edittext3.getText().toString().concat(" [ ]"));
						} else {
							SketchwareUtil.showMessage(getApplicationContext(), "Hata");
						}
					}
				}
			}
		});
		
		textview18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (linearhtml.getVisibility() == View.VISIBLE) {
					edittext1.setText(edittext1.getText().toString().concat(" #"));
				} else {
					if (linearcss.getVisibility() == View.VISIBLE) {
						edittext2.setText(edittext2.getText().toString().concat(" #"));
					} else {
						if (linearjs.getVisibility() == View.VISIBLE) {
							edittext3.setText(edittext3.getText().toString().concat(" #"));
						} else {
							SketchwareUtil.showMessage(getApplicationContext(), "Hata");
						}
					}
				}
			}
		});
		
		_rqe_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				
			}
		};
		
		_fdb_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		fdb.addChildEventListener(_fdb_child_listener);
	}
	
	private void initializeLogic() {
		textview175.setText(getIntent().getStringExtra("baslik"));
		linearhtmlicon.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFF616161));
		linearcssicon.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)0, Color.TRANSPARENT));
		linearjsicon.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)0, Color.TRANSPARENT));
		linearhtml.setVisibility(View.VISIBLE);
		linearcss.setVisibility(View.GONE);
		linearjs.setVisibility(View.GONE);
		_setHighlighter(edittext1);
		_setHighlighter(edittext2);
		_setHighlighter(edittext3);
	}
	
	@Override
	public void onBackPressed() {
		dialog.setTitle("Ana Menüye Dön");
		dialog.setMessage("Ana menüye geri dönülsünmü?");
		dialog.setPositiveButton("Tamam", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				i.setClass(getApplicationContext(), MenuActivity.class);
				startActivity(i);
				finish();
			}
		});
		dialog.setNeutralButton("İptal", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		//Code generated by App Designer
		{
			final AlertDialog alert = dialog.show();
			DisplayMetrics screen = new DisplayMetrics();
			getWindowManager().getDefaultDisplay().getMetrics(screen);
			double dp = 24;
			double logicalDensity = screen.density;
			int px = (int) Math.ceil(dp * logicalDensity);
			alert.getWindow().getDecorView().setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)px, Color.parseColor("#424242")));
			alert.getWindow().getDecorView().setPadding(8,8,8,8);
			alert.show();
			
			alert.getButton(AlertDialog.BUTTON_POSITIVE).setTextColor(Color.parseColor("#FAFAFA"));
			alert.getButton(AlertDialog.BUTTON_NEGATIVE).setTextColor(Color.parseColor("#FAFAFA"));
			alert.getButton(AlertDialog.BUTTON_NEUTRAL).setTextColor(Color.parseColor("#FAFAFA"));
			alert.getWindow().setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL);
			alert.getWindow().getDecorView().setTranslationY(-20);
			TextView textT = (TextView)alert.getWindow().getDecorView().findViewById(android.R.id.message);
			textT.setTextColor(Color.parseColor("#FAFAFA"));
			
			int titleId = getResources().getIdentifier( "alertTitle", "id", "android" ); 
			
			if (titleId > 0) { 
				TextView dialogTitle = (TextView) alert.getWindow().getDecorView().findViewById(titleId); 
				
				if (dialogTitle != null) {
					dialogTitle.setTextColor(Color.parseColor("#FAFAFA"));
				} 
			}}
	}
	public void _setHighlighter(final TextView _view) {
		final String secondaryColor = "#678cb1";
		final String primaryColor = "#86b55a";
		final String numbersColor = "#f6c921";
		final String quotesColor = "#ff1744";
		final String commentsColor = "#9e9e9e";
		final String charColor = "#ff5722";
		final TextView regex1 = new TextView(this);
		final TextView regex2 = new TextView(this);
		final TextView regex3 = new TextView(this);
		final TextView regex4 = new TextView(this);
		final TextView regex5 = new TextView(this);
		final TextView regex6 = new TextView(this);
		final TextView regex7 = new TextView(this);
		final TextView regex8 = new TextView(this);
		final TextView regex9 = new TextView(this);
		final TextView regex10 = new TextView(this);
		final TextView regex11 = new TextView(this);
		
		regex1.setText("\\b(out|print|println|valueOf|toString|concat|equals|for|while|switch|getText");
		
		regex2.setText("|println|printf|print|out|parseInt|round|sqrt|charAt|compareTo|compareToIgnoreCase|concat|contains|contentEquals|equals|length|toLowerCase|trim|toUpperCase|toString|valueOf|substring|startsWith|split|replace|replaceAll|lastIndexOf|size)\\b");
		
		regex3.setText("\\b(public|private|protected|void|switch|case|class|import|package|extends|Activity|TextView|EditText|LinearLayout|CharSequence|String|int|onCreate|ArrayList|float|if|else|static|Intent|Button|SharedPreferences");
		
		regex4.setText("|abstract|assert|boolean|break|byte|case|catch|char|class|const|continue|default|do|double|else|enum|extends|final|finally|float|for|goto|if|implements|import|instanceof|interface|long|native|new|package|private|protected|");
		
		regex5.setText("public|return|short|static|strictfp|super|switch|synchronized|this|throw|throws|transient|try|void|volatile|while|true|false|null)\\b");
		
		regex6.setText("\\b([0-9]+)\\b");
		
		regex7.setText("(\\w+)(\\()+");
		
		regex8.setText("\\@\\s*(\\w+)");
		
		regex9.setText("\"(.*?)\"|'(.*?)'");
		
		regex10.setText("/\\*(?:.|[\\n\\r])*?\\*/|//.*");
		
		regex11.setText("\\b(Uzuakoli|Amoji|Bright|Ndudirim|Ezinwanne|Lightworker|Isuochi|Abia|Ngodo)\\b");
		_view.addTextChangedListener(new TextWatcher() {
			ColorScheme keywords1 = new ColorScheme(java.util.regex.Pattern.compile(regex1.getText().toString().concat(regex2.getText().toString())), Color.parseColor(secondaryColor));
			
			ColorScheme keywords2 = new ColorScheme(java.util.regex.Pattern.compile(regex3.getText().toString().concat(regex4.getText().toString().concat(regex5.getText().toString()))), Color.parseColor(primaryColor));
			
			ColorScheme keywords3 = new ColorScheme(java.util.regex.Pattern.compile(regex6.getText().toString()), Color.parseColor(numbersColor));
			
			ColorScheme keywords4 = new ColorScheme(java.util.regex.Pattern.compile(regex7.getText().toString()), Color.parseColor(secondaryColor));
			
			ColorScheme keywords5 = new ColorScheme(java.util.regex.Pattern.compile(regex9.getText().toString()), Color.parseColor(quotesColor));
			
			ColorScheme keywords6 = new ColorScheme(java.util.regex.Pattern.compile(regex10.getText().toString()), Color.parseColor(commentsColor));
			
			ColorScheme keywords7 = new ColorScheme(java.util.regex.Pattern.compile(regex8.getText().toString()), Color.parseColor(numbersColor));
			
			
			ColorScheme keywords8 = new ColorScheme(java.util.regex.Pattern.compile(regex11.getText().toString()), Color.parseColor(charColor));
			
			final ColorScheme[] schemes = {keywords1, keywords2, keywords3, keywords4, keywords5, keywords6, keywords7, keywords8}; @Override public void beforeTextChanged(CharSequence s, int start, int count, int after) { } @Override public void onTextChanged(CharSequence s, int start, int before, int count) { } @Override public void afterTextChanged(Editable s) { removeSpans(s, android.text.style.ForegroundColorSpan.class); for(ColorScheme scheme : schemes) { for(java.util.regex.Matcher m = scheme.pattern.matcher(s);
					
					m.find();) { if (scheme == keywords4) { s.setSpan(new android.text.style.ForegroundColorSpan(scheme.color), m.start(), m.end()-1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
						} 
						else { s.setSpan(new android.text.style.ForegroundColorSpan(scheme.color), m.start(), m.end(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE); } } } } void removeSpans(Editable e, Class type) { android.text.style.CharacterStyle[] spans = e.getSpans(0, e.length(), type); for (android.text.style.CharacterStyle span : spans) { e.removeSpan(span); } } class ColorScheme { final java.util.regex.Pattern pattern; final int color; ColorScheme(java.util.regex.Pattern pattern, int color) { this.pattern = pattern; this.color = color; } } });
	}
	
}