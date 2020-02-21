# NotePad
Vertical Lines in EditText Like a NotePad :grin:


1.add jitpack to your repositories

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
	
	
  
  2.add dependencies to your build.gradle 
  
  	dependencies {
	        implementation 'com.github.Sanaebadi97:NotePad:Tag'
	}

**Current Release is 1.0.0 :relaxed:**

3.Usage in XML :

    <sanaebadi.info.mnotepad.LineEditText
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="#DFDF5B"
        android:gravity="top"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:lineColor="@android:color/black"
        app:strokeWidth="3" />
	
	
	
4.Output with strokeWidth =2 and  lineColor="@android:color/black"

![Screenshot_2020-02-19_15-42-33](https://user-images.githubusercontent.com/26750131/74833440-b34d2580-532e-11ea-9fed-a6a0b80e3aeb.png)

