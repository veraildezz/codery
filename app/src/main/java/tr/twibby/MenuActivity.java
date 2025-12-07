package tr.twibby;

import android.Manifest;
import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.ClipData;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.os.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.button.*;
import com.google.android.material.textfield.*;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.ArrayList;
import java.util.regex.*;
import org.json.*;

public class MenuActivity extends AppCompatActivity {
	
	public final int REQ_CD_FP = 101;
	
	private double yazi = 0;
	private boolean a = false;
	private boolean b = false;
	private boolean c = false;
	private boolean d = false;
	private String j = "";
	private String yol = "";
	
	private ArrayList<String> l = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout linearresim;
	private ScrollView vscroll1;
	private TextView textbaslik;
	private MaterialButton materialbutton2;
	private TextView textlogobaslik;
	private LinearLayout linear7;
	private LinearLayout linear29;
	private LinearLayout linear56;
	private LinearLayout linear6;
	private ImageView imageview1;
	private TextView textlogotekharf;
	private TextView textlogoaltyazi;
	private LinearLayout linear5;
	private LinearLayout linear9;
	private LinearLayout linear8;
	private LinearLayout linear10;
	private LinearLayout linear26;
	private LinearLayout linear28;
	private LinearLayout linear30;
	private LinearLayout linear31;
	private LinearLayout linear34;
	private LinearLayout linear38;
	private LinearLayout linear48;
	private LinearLayout linear49;
	private LinearLayout linear55;
	private TextView textview5;
	private TextView textview4;
	private MaterialButton materialbutton1;
	private LinearLayout linear27;
	private HorizontalScrollView hscroll1;
	private TextView textview6;
	private LinearLayout linear11;
	private LinearLayout linear12;
	private LinearLayout linear15;
	private LinearLayout linear14;
	private LinearLayout linear16;
	private LinearLayout linear17;
	private LinearLayout linear18;
	private LinearLayout linear19;
	private LinearLayout linear20;
	private LinearLayout linear21;
	private LinearLayout linear22;
	private LinearLayout linear23;
	private LinearLayout linear24;
	private LinearLayout linear25;
	private ImageView imageview3;
	private ImageView imageview4;
	private ImageView imageview5;
	private ImageView imageview6;
	private ImageView imageview7;
	private ImageView imageview8;
	private ImageView imageview9;
	private TextView textview7;
	private Switch switch3;
	private TextView textview8;
	private SeekBar seekbar1;
	private TextView textview10;
	private SeekBar seekbar3;
	private TextView textview12;
	private Switch switch1;
	private LinearLayout linear43;
	private LinearLayout linear45;
	private LinearLayout linear33;
	private TextView textview13;
	private SeekBar seekbar5;
	private TextView textview15;
	private SeekBar seekbar7;
	private TextInputLayout textinputlayout8;
	private ImageView imageview15;
	private EditText edittext3;
	private TextInputLayout textinputlayout3;
	private ImageView imageview12;
	private EditText edittext1;
	private TextView textview16;
	private Switch switch4;
	private LinearLayout linear40;
	private LinearLayout linear46;
	private LinearLayout linear47;
	private TextView textview19;
	private SeekBar seekbar8;
	private TextView textview20;
	private SeekBar seekbar11;
	private LinearLayout linear35;
	private TextInputLayout textinputlayout5;
	private ImageView imageview13;
	private EditText edittext2;
	private TextInputLayout textinputlayout9;
	private ImageView imageview16;
	private TextInputLayout textinputlayout10;
	private EditText edittext4;
	private TextView textview21;
	private Switch switch5;
	private LinearLayout linear50;
	private LinearLayout linear53;
	private TextView textview22;
	private SeekBar seekbar12;
	private TextView textview23;
	private SeekBar seekbar13;
	private TextInputLayout textinputlayout12;
	private ImageView imageview17;
	private EditText edittext7;
	private TextView textview24;
	
	private Intent fp = new Intent(Intent.ACTION_GET_CONTENT);
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.menu);
		initialize(_savedInstanceState);
		
		if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED
		|| ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
			ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1000);
		} else {
			initializeLogic();
		}
	}
	
	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		if (requestCode == 1000) {
			initializeLogic();
		}
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		linearresim = findViewById(R.id.linearresim);
		vscroll1 = findViewById(R.id.vscroll1);
		textbaslik = findViewById(R.id.textbaslik);
		materialbutton2 = findViewById(R.id.materialbutton2);
		textlogobaslik = findViewById(R.id.textlogobaslik);
		linear7 = findViewById(R.id.linear7);
		linear29 = findViewById(R.id.linear29);
		linear56 = findViewById(R.id.linear56);
		linear6 = findViewById(R.id.linear6);
		imageview1 = findViewById(R.id.imageview1);
		textlogotekharf = findViewById(R.id.textlogotekharf);
		textlogoaltyazi = findViewById(R.id.textlogoaltyazi);
		linear5 = findViewById(R.id.linear5);
		linear9 = findViewById(R.id.linear9);
		linear8 = findViewById(R.id.linear8);
		linear10 = findViewById(R.id.linear10);
		linear26 = findViewById(R.id.linear26);
		linear28 = findViewById(R.id.linear28);
		linear30 = findViewById(R.id.linear30);
		linear31 = findViewById(R.id.linear31);
		linear34 = findViewById(R.id.linear34);
		linear38 = findViewById(R.id.linear38);
		linear48 = findViewById(R.id.linear48);
		linear49 = findViewById(R.id.linear49);
		linear55 = findViewById(R.id.linear55);
		textview5 = findViewById(R.id.textview5);
		textview4 = findViewById(R.id.textview4);
		materialbutton1 = findViewById(R.id.materialbutton1);
		linear27 = findViewById(R.id.linear27);
		hscroll1 = findViewById(R.id.hscroll1);
		textview6 = findViewById(R.id.textview6);
		linear11 = findViewById(R.id.linear11);
		linear12 = findViewById(R.id.linear12);
		linear15 = findViewById(R.id.linear15);
		linear14 = findViewById(R.id.linear14);
		linear16 = findViewById(R.id.linear16);
		linear17 = findViewById(R.id.linear17);
		linear18 = findViewById(R.id.linear18);
		linear19 = findViewById(R.id.linear19);
		linear20 = findViewById(R.id.linear20);
		linear21 = findViewById(R.id.linear21);
		linear22 = findViewById(R.id.linear22);
		linear23 = findViewById(R.id.linear23);
		linear24 = findViewById(R.id.linear24);
		linear25 = findViewById(R.id.linear25);
		imageview3 = findViewById(R.id.imageview3);
		imageview4 = findViewById(R.id.imageview4);
		imageview5 = findViewById(R.id.imageview5);
		imageview6 = findViewById(R.id.imageview6);
		imageview7 = findViewById(R.id.imageview7);
		imageview8 = findViewById(R.id.imageview8);
		imageview9 = findViewById(R.id.imageview9);
		textview7 = findViewById(R.id.textview7);
		switch3 = findViewById(R.id.switch3);
		textview8 = findViewById(R.id.textview8);
		seekbar1 = findViewById(R.id.seekbar1);
		textview10 = findViewById(R.id.textview10);
		seekbar3 = findViewById(R.id.seekbar3);
		textview12 = findViewById(R.id.textview12);
		switch1 = findViewById(R.id.switch1);
		linear43 = findViewById(R.id.linear43);
		linear45 = findViewById(R.id.linear45);
		linear33 = findViewById(R.id.linear33);
		textview13 = findViewById(R.id.textview13);
		seekbar5 = findViewById(R.id.seekbar5);
		textview15 = findViewById(R.id.textview15);
		seekbar7 = findViewById(R.id.seekbar7);
		textinputlayout8 = findViewById(R.id.textinputlayout8);
		imageview15 = findViewById(R.id.imageview15);
		edittext3 = findViewById(R.id.edittext3);
		textinputlayout3 = findViewById(R.id.textinputlayout3);
		imageview12 = findViewById(R.id.imageview12);
		edittext1 = findViewById(R.id.edittext1);
		textview16 = findViewById(R.id.textview16);
		switch4 = findViewById(R.id.switch4);
		linear40 = findViewById(R.id.linear40);
		linear46 = findViewById(R.id.linear46);
		linear47 = findViewById(R.id.linear47);
		textview19 = findViewById(R.id.textview19);
		seekbar8 = findViewById(R.id.seekbar8);
		textview20 = findViewById(R.id.textview20);
		seekbar11 = findViewById(R.id.seekbar11);
		linear35 = findViewById(R.id.linear35);
		textinputlayout5 = findViewById(R.id.textinputlayout5);
		imageview13 = findViewById(R.id.imageview13);
		edittext2 = findViewById(R.id.edittext2);
		textinputlayout9 = findViewById(R.id.textinputlayout9);
		imageview16 = findViewById(R.id.imageview16);
		textinputlayout10 = findViewById(R.id.textinputlayout10);
		edittext4 = findViewById(R.id.edittext4);
		textview21 = findViewById(R.id.textview21);
		switch5 = findViewById(R.id.switch5);
		linear50 = findViewById(R.id.linear50);
		linear53 = findViewById(R.id.linear53);
		textview22 = findViewById(R.id.textview22);
		seekbar12 = findViewById(R.id.seekbar12);
		textview23 = findViewById(R.id.textview23);
		seekbar13 = findViewById(R.id.seekbar13);
		textinputlayout12 = findViewById(R.id.textinputlayout12);
		imageview17 = findViewById(R.id.imageview17);
		edittext7 = findViewById(R.id.edittext7);
		textview24 = findViewById(R.id.textview24);
		fp.setType("image/*");
		fp.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true);
		
		materialbutton2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				yol = FileUtil.getExternalStorageDir().concat("/TwibbyApp/");
				_saveView(linearresim);
			}
		});
		
		materialbutton1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				startActivityForResult(fp, REQ_CD_FP);
			}
		});
		
		imageview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linearresim.setBackgroundResource(R.drawable.fiber);
			}
		});
		
		imageview4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linearresim.setBackgroundResource(R.drawable.tuval);
			}
		});
		
		imageview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linearresim.setBackgroundResource(R.drawable.orumcekagi);
			}
		});
		
		imageview6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linearresim.setBackgroundResource(R.drawable.ikilikare);
			}
		});
		
		imageview7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linearresim.setBackgroundResource(R.drawable.satranckare);
			}
		});
		
		imageview8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linearresim.setBackgroundResource(R.drawable.uccizgikare);
			}
		});
		
		imageview9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				linearresim.setBackgroundResource(R.drawable.kaya);
			}
		});
		
		switch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					imageview1.setVisibility(View.GONE);
					imageview1.setVisibility(View.GONE);
				} else {
					imageview1.setVisibility(View.VISIBLE);
					imageview1.setVisibility(View.VISIBLE);
				}
			}
		});
		
		seekbar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			@Override
			public void onProgressChanged(SeekBar _param1, int _param2, boolean _param3) {
				final int _progressValue = _param2;
				imageview1.setTranslationX((float)(_progressValue));
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar _param1) {
				
			}
			
			@Override
			public void onStopTrackingTouch(SeekBar _param2) {
				
			}
		});
		
		seekbar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			@Override
			public void onProgressChanged(SeekBar _param1, int _param2, boolean _param3) {
				final int _progressValue = _param2;
				imageview1.setTranslationY((float)(_progressValue));
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar _param1) {
				
			}
			
			@Override
			public void onStopTrackingTouch(SeekBar _param2) {
				
			}
		});
		
		switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					textlogobaslik.setVisibility(View.GONE);
					linear31.setVisibility(View.GONE);
				} else {
					textlogobaslik.setVisibility(View.VISIBLE);
					linear31.setVisibility(View.VISIBLE);
				}
			}
		});
		
		seekbar5.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			@Override
			public void onProgressChanged(SeekBar _param1, int _param2, boolean _param3) {
				final int _progressValue = _param2;
				textlogobaslik.setTranslationX((float)(_progressValue));
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar _param1) {
				
			}
			
			@Override
			public void onStopTrackingTouch(SeekBar _param2) {
				
			}
		});
		
		seekbar7.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			@Override
			public void onProgressChanged(SeekBar _param1, int _param2, boolean _param3) {
				final int _progressValue = _param2;
				textlogobaslik.setTranslationY((float)(_progressValue));
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar _param1) {
				
			}
			
			@Override
			public void onStopTrackingTouch(SeekBar _param2) {
				
			}
		});
		
		imageview15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (edittext3.getText().toString().equals("#FFFFFF")) {
					textlogobaslik.setTextColor(0xFFFFFFFF);
				} else {
					if (edittext3.getText().toString().equals("#FF0000")) {
						textlogobaslik.setTextColor(0xFFFF0000);
					} else {
						if (edittext3.getText().toString().equals("#00FF00")) {
							textlogobaslik.setTextColor(0xFF00FF00);
						} else {
							if (edittext3.getText().toString().equals("#808080")) {
								textlogobaslik.setTextColor(0xFF808080);
							} else {
								if (edittext3.getText().toString().equals("#FF00FF")) {
									textlogobaslik.setTextColor(0xFFFF00FF);
								} else {
									if (edittext3.getText().toString().equals("#0000FF")) {
										textlogobaslik.setTextColor(0xFF0000FF);
									} else {
										if (edittext3.getText().toString().equals("#800080")) {
											textlogobaslik.setTextColor(0xFF800080);
										} else {
											if (edittext3.getText().toString().equals("#FFA500")) {
												textlogobaslik.setTextColor(0xFFFFA500);
											} else {
												if (edittext3.getText().toString().equals("#000000")) {
													textlogobaslik.setTextColor(0xFF000000);
												} else {
													if (edittext3.getText().toString().equals("#2196F3")) {
														textlogobaslik.setTextColor(0xFF2196F3);
													} else {
														if (edittext3.getText().toString().equals("#795548")) {
															textlogobaslik.setTextColor(0xFF795548);
														} else {
															((EditText)edittext3).setError("Hex Kodu Giriniz");
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		});
		
		imageview12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				textlogobaslik.setText(edittext1.getText().toString());
			}
		});
		
		switch4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					textlogotekharf.setVisibility(View.GONE);
					linear38.setVisibility(View.GONE);
				} else {
					textlogotekharf.setVisibility(View.VISIBLE);
					linear38.setVisibility(View.VISIBLE);
				}
			}
		});
		
		seekbar8.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			@Override
			public void onProgressChanged(SeekBar _param1, int _param2, boolean _param3) {
				final int _progressValue = _param2;
				textlogotekharf.setTranslationX((float)(_progressValue));
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar _param1) {
				
			}
			
			@Override
			public void onStopTrackingTouch(SeekBar _param2) {
				
			}
		});
		
		seekbar11.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			@Override
			public void onProgressChanged(SeekBar _param1, int _param2, boolean _param3) {
				final int _progressValue = _param2;
				textlogotekharf.setTranslationY((float)(_progressValue));
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar _param1) {
				
			}
			
			@Override
			public void onStopTrackingTouch(SeekBar _param2) {
				
			}
		});
		
		imageview13.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				textlogotekharf.setText(edittext2.getText().toString());
			}
		});
		
		imageview16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (edittext4.getText().toString().equals("#FFFFFF")) {
					textlogotekharf.setTextColor(0xFFFFFFFF);
				} else {
					if (edittext4.getText().toString().equals("#FF0000")) {
						textlogotekharf.setTextColor(0xFFFF0000);
					} else {
						if (edittext4.getText().toString().equals("#00FF00")) {
							textlogotekharf.setTextColor(0xFF00FF00);
						} else {
							if (edittext4.getText().toString().equals("#808080")) {
								textlogotekharf.setTextColor(0xFF808080);
							} else {
								if (edittext4.getText().toString().equals("#FF00FF")) {
									textlogotekharf.setTextColor(0xFFFF00FF);
								} else {
									if (edittext4.getText().toString().equals("#0000FF")) {
										textlogotekharf.setTextColor(0xFF0000FF);
									} else {
										if (edittext4.getText().toString().equals("#800080")) {
											textlogotekharf.setTextColor(0xFF800080);
										} else {
											if (edittext4.getText().toString().equals("#FFA500")) {
												textlogotekharf.setTextColor(0xFFFFA500);
											} else {
												if (edittext4.getText().toString().equals("#000000")) {
													textlogotekharf.setTextColor(0xFF000000);
												} else {
													if (edittext4.getText().toString().equals("#2196F3")) {
														textlogotekharf.setTextColor(0xFF2196F3);
													} else {
														if (edittext4.getText().toString().equals("#795548")) {
															textlogotekharf.setTextColor(0xFF795548);
														} else {
															((EditText)edittext3).setError("Hex Kodu Giriniz");
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		});
		
		switch5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2) {
				final boolean _isChecked = _param2;
				if (_isChecked) {
					linear49.setVisibility(View.GONE);
					linear6.setVisibility(View.GONE);
				} else {
					linear49.setVisibility(View.VISIBLE);
					linear6.setVisibility(View.VISIBLE);
				}
			}
		});
		
		seekbar12.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			@Override
			public void onProgressChanged(SeekBar _param1, int _param2, boolean _param3) {
				final int _progressValue = _param2;
				linear6.setTranslationX((float)(_progressValue));
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar _param1) {
				
			}
			
			@Override
			public void onStopTrackingTouch(SeekBar _param2) {
				
			}
		});
		
		seekbar13.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
			@Override
			public void onProgressChanged(SeekBar _param1, int _param2, boolean _param3) {
				final int _progressValue = _param2;
				linear6.setTranslationY((float)(_progressValue));
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar _param1) {
				
			}
			
			@Override
			public void onStopTrackingTouch(SeekBar _param2) {
				
			}
		});
		
		imageview17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				textlogoaltyazi.setText(edittext7.getText().toString());
			}
		});
	}
	
	private void initializeLogic() {
		seekbar1.setMax((int)800);
		seekbar3.setMax((int)800);
		seekbar5.setMax((int)800);
		seekbar7.setMax((int)800);
		seekbar8.setMax((int)800);
		seekbar11.setMax((int)800);
		seekbar12.setMax((int)800);
		seekbar13.setMax((int)800);
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			case REQ_CD_FP:
			if (_resultCode == Activity.RESULT_OK) {
				ArrayList<String> _filePath = new ArrayList<>();
				if (_data != null) {
					if (_data.getClipData() != null) {
						for (int _index = 0; _index < _data.getClipData().getItemCount(); _index++) {
							ClipData.Item _item = _data.getClipData().getItemAt(_index);
							_filePath.add(FileUtil.convertUriToFilePath(getApplicationContext(), _item.getUri()));
						}
					}
					else {
						_filePath.add(FileUtil.convertUriToFilePath(getApplicationContext(), _data.getData()));
					}
				}
				imageview1.setImageBitmap(FileUtil.decodeSampleBitmapFromPath(_filePath.get((int)(0)), 1024, 1024));
			}
			else {
				
			}
			break;
			default:
			break;
		}
	}
	
	public void _yazidegisme() {
		yazi = SketchwareUtil.getRandom((int)(1), (int)(5));
		if (yazi == 1) {
			textbaslik.setText("Hoşgeldin!");
		}
		if (yazi == 2) {
			textbaslik.setText("Twibby❤️");
		}
		if (yazi == 3) {
			textbaslik.setText("Logo Maker");
		}
		if (yazi == 4) {
			textbaslik.setText("Nasılsın?");
		}
		if (yazi == 5) {
			textbaslik.setText("Tamamen Bedava");
		}
	}
	
	
	public void _saveView(final View _view) {
		Bitmap returnedBitmap = Bitmap.createBitmap(_view.getWidth(), _view.getHeight(), Bitmap.Config.ARGB_8888);
		Canvas canvas = new Canvas(returnedBitmap);
		android.graphics.drawable.Drawable bgDrawable = _view.getBackground();
		
		if (bgDrawable != null) {
			bgDrawable.draw(canvas);
		} else {
			canvas.drawColor(Color.WHITE);
		}
		_view.draw(canvas);
		
		String fileName = "twibbyapp.png";
		int counter = 1;
		java.io.File pictureFile;
		String baseFileName = "myimage";
		String extension = ".png";
		
		do {
			String finalFileName = baseFileName + (counter > 1 ? String.valueOf(counter) : "") + extension;
			pictureFile = new java.io.File(Environment.getExternalStorageDirectory() + "/Download/" + finalFileName);
			counter++;
		} while (pictureFile.exists());
		
		try {
			java.io.FileOutputStream fos = new java.io.FileOutputStream(pictureFile);
			returnedBitmap.compress(Bitmap.CompressFormat.PNG, 100, fos);
			fos.close();
			showMessage("Resim " + pictureFile.getName() + " /Download/ Kaydedildi");
		} catch (java.io.FileNotFoundException e) {
			showMessage("Dosya Bukunamadi: " + e.getMessage());
		} catch (java.io.IOException e) {
			showMessage("Dosyayi Acarken Hata: " + e.getMessage());
		}
		
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}