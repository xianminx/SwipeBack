SwipeBack 
=============================
Navigate back to the previous Activity by Swipe Gesture from the left edge of the screen.

[![Build Status](https://travis-ci.org/xianminx/SwipeBack.svg)](https://travis-ci.org/xianminx/SwipeBack)
[ ![Download](https://api.bintray.com/packages/xianminx/maven/SwipeBack/images/download.svg) ](https://bintray.com/xianminx/maven/SwipeBack/_latestVersion)

## Demo

<iframe width="420" height="315" src="https://www.youtube.com/embed/QoQxScMfRUk" frameborder="0" allowfullscreen></iframe>
[![IMAGE ALT TEXT HERE](http://img.youtube.com/vi/QoQxScMfRUk/0.jpg)](http://www.youtube.com/watch?v=QoQxScMfRUk)



## Usage

* Add Gradle dependency

```groovy
    compile 'android.lucas:swipeback:0.0.1'
```

* Add Application's or Activity's theme.


```xml
<!-- file  ./app/src/main/res/values/styles.xml -->
<!-- Base application theme. -->
<style name="AppTheme" parent="Theme.AppCompat.Light.DarkActionBar">
    <item name="android:windowIsTranslucent">true</item>
    <item name="android:windowBackground">@android:color/transparent</item>
    <!-- Customize your theme here. -->
</style>
```

```xml
<application
        android:theme="@style/AppTheme" >
```

* For the activity your want to support SwipeBack gesture, add the following code:

```java
public class MainActivity extends ActionBarActivity {
    private static final String TAG = MainActivity.class.getName();
    private SwipeBack mSwipeBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSwipeBack = new SwipeBack(this);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return mSwipeBack.onTouchEvent(ev) || super.dispatchTouchEvent(ev);
    }
```


License
-------

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.


