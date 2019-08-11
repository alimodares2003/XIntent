# XIntent
Easy start activity and pass data between two activity

# Installation
```gradle
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}

//add this to your dependencies
implementation 'com.github.alimodares2003:XIntent:1.0.0'
```

# How to use
Please read all comments

```kotlin
        //Simple start activity
        goActivity(SecondActivity::class.java)

        //start activity with finish activity
        goActivity(SecondActivity::class.java, true)

        //start activity with custom intent
        goActivity(Intent(this, SecondActivity::class.java))

        //start activity with custom intent and finish activity
        goActivity(Intent(this, SecondActivity::class.java), true)

        //start activity with pass data. you can pass any type of data like double,short,long,int,char,array,arraylist,bundle,Serializable,Parcalable and ...
        goActivity(
            SecondActivity::class.java,
            arrayOf("name", "number", "login", "model"),//key name, must be arrayOf()
            "ali", 12345, true, MainModel("ali")//value
        )

        //start activity with pass data and finish activity. you can pass any type of data like double,short,long,int,char,array,arraylist,bundle,Serializable,Parcalable and ...
        goActivity(
            SecondActivity::class.java,
            arrayOf("name", "number", "login", "model"),//key name, must be arrayOf()
            "ali", 12345, true, MainModel("ali"),//value
            isFinish = true
        )

        // start activity with model. model must be Parcelable
        goActivity(SecondActivity::class.java, MainModel("ali"))

        // start activity with model and finish activity. model must be Parcelable
        goActivity(SecondActivity::class.java, MainModel("ali"), isFinish = true)
```
