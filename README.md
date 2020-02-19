# NotePad
Vertical Lines in EditText Like NotePad


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
