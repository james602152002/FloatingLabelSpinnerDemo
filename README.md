# FloatingLabelSpinnerDemo

## Reference
[FloatingLabelSpinner](https://github.com/james602152002/FloatingLabelSpinner)

##Dependency

```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}

```

```
dependencies {
	compile 'com.github.james602152002:FloatingLabelSpinner:1.1.2'
}
```

##Property

```xml
<com.james602152002.floatinglabelspinner.FloatingLabelSpinner
          android:layout_width="match_parent"
          android:layout_height="wrap_content"
          //floating label and hint text color
          app:j_fls_textColorHint="@android:color/holo_orange_light" 
          //divider color
          app:j_fls_colorHighlight="#0000FF" 
          //error color
          app:j_fls_colorError="#0000FF"
          //floating label text
          app:j_fls_hint="label"
          //thickness of divider
          app:j_fls_thickness="2dp"
          //horizontal margin of label
          app: j_fls_label_horizontal_margin="2dp"
          //vertical margin of label
          app: j_fls_label_vertical_margin="2dp"
          //horizontal margin of error text
          app: j_fls_error_horizontal_margin="2dp"
          //vertical margin of error text
          app: j_fls_error_vertical_margin="2dp"
          //floating label text size
          app: j_fls_label_textSize="14sp"
          //hint text size
          app:j_fls_hint_textSize="20sp"
          //error text size
          app:j_fls_error_textSize="14sp"
          //header of drop down hint view
          app:j_fls_dropDownHintView="@layout/header"
          //float animation duration(unit：ms)
          app:j_fls_float_anim_duration="800"
          //scrolling text animation duration(unit：ms)
          app:j_fls_error_anim_duration="8000"/>
          
```

##Method
```java
    //floating label text size
	setLabel_text_size(float label_text_size);
	//hint text size
	setHint_text_size(float hint_text_size);
	//error text size
	setError_text_size(float error_text_size);
	//thichness of divider
	setThickness(int thickness);
	//divider color
	setHighlight_color(int color);
	//hint text color
	setHint_text_color(int color);
	//error color
	setError_color(int color);
	//set error text horizontal and vertical margin
	setErrorMargin(int horizontal_margin, int vertical_margin);
	//set float label text and hint text(Support ForegroundColorSpan)
	spinner.setHint(CharSequence hint);
	//set drop down hint view header
	spinner.setDropDownHintView(View view);
	//set error text(null for cancel error status)
	setError(String error);
	
```