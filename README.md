# BottomNavigationBar
simple example, how to create Bottom Navigation Bar
                                                  Bottom NavigationBar  (Kotlin)

1.	First of all need implementation some library for work with navigation. (build.gradle (Module:app) file – part dependencies:
    “androidx.navigation:navigation-fragment-ktx:2.3.0-alpha01”
    “androidx.navigation:navigation-ui-ktx:2.3.0-alpha01”

2.	In resource (res) folder need create new resource directory “menu” (or something like this). In parameters “Resource type” need take “menu” type. Press “OK”
    In this directory need create new “Menu resource file” with name “menu” (or something like this)
	  In “menu” (resource file) need used tag <Item/> inside this tag you need to write description different power of menu “button”. Exapmle:
      <inem
	      android:id=”@+id/ home”
	      android:title=”Home”
	       …
        />
      (if you like, you can add some icon to the buttons)
      
3.	In activity_main.xml file need add BottomNavigationView & write description different view power
4.	In package with root activity need create new package (something like “parts” or “fragments”)
    Then need create 4 new fragment (one new fragment on one NavigationBar button)
5.	Open activity_main.xml ,again, need add fragment. Something like this:
      <fragment
	      android:id=”@+id/navigation_fragment”
	      android:name=”androidx.navigation.fragment.NavHostFragment”
	      android:layout_width=”match_parent”
	      android:layout_height=”0dp”
	      android:layout_weight=”1”
	      app:defaultNavHost=”true”
	      app:navGraph=”@navigation/navigation” (resources) />
        
6.	In resource (res) folder need create new resource directory “navigation” (or something like this). In parameters “Resource type” need take “navigation” type. Press “OK”
    In this directory need create new “navigation resource file” with name “navigation” (or something like this)

7.	In Maim_activity.kt create new variable NavContraller and initialized it. Them initialized bottonNavigationBar value and setup (used setupActionBarWithController())
    Override onSupportNavigateUp method, if you wont used “Back”  button in actionBar.

8.	In navigation file you need to link the "Menu" file and layout file (button of a BottomNavigationView)

9.	Run and test app
