# BottomSheetMenu
You can create awesome menus with bottom sheet experience in a few lines

[![](https://jitpack.io/v/mazenrashed/BottomSheetMenu.svg)](https://jitpack.io/#mazenrashed/BottomSheetMenu)

![](https://im2.ezgif.com/tmp/ezgif-2-1b238086a05a.gif)


###  Add the JitPack repository to your build file
```groovy
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
### Add dependency
```groovy
dependencies {
    implementation 'com.github.mazenrashed:BottomSheetMenu:${LAST_VERSION}'
}
```
# How to use

### Create a menu
```xml
<menu xmlns:android="http://schemas.android.com/apk/res/android">
    <item
        android:id="@+id/option1"
        android:icon="@drawable/ic_baseline_alarm_off_24"
        android:title="Turn alarm on" />
    <item
        android:id="@+id/option2"
        android:icon="@drawable/ic_baseline_alarm_on_24"
        android:title="Turn alarm off" />
</menu>
```

### Use BottomSheetMenu builder
```kotlin
val bottomSheet = MenuBottomSheet.Builder()
    .setMenuRes(R.menu.test_menu)          
    .closeAfterSelect(true)                
    .build()                               
```

* You can add the menu items programmatically without menu file
```kotlin
val menuItems = arrayListOf(                                                  
    MenuBottomSheetItem("Turn alarm on", R.drawable.ic_baseline_alarm_on_24), 
    MenuBottomSheetItem("Turn alarm off", R.drawable.ic_baseline_alarm_off_24)
)                                                                             
            
val bottomSheet = MenuBottomSheet.Builder()
    .setMenuItems(menuItems)         
    .closeAfterSelect(true)                         
    .build()                        
  ```

### Show menu
```kotlin
bottomSheet.show(this)
```

### Listen to on item click
```kotlin
bottomSheet.onSelectMenuItemListener = { position: Int, id: Int? ->           
    when (id) {                                                               
        R.id.option1 -> Toast.makeText(this, "On", Toast.LENGTH_SHORT).show() 
        R.id.option2 -> Toast.makeText(this, "Off", Toast.LENGTH_SHORT).show()
        else -> Toast.makeText(this, "Nothing", Toast.LENGTH_SHORT).show()    
    }                                                                         
}                                                                             ```
```
## Contributing

We welcome contributions !
* ⇄ Pull requests and ★ Stars are always welcome.
