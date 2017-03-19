# end-line convertor logcat

#### Preprocess => logs.log 
```
E/AndroidRuntime(10187): 	at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:2790)E/AndroidRuntime(10187): 	at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:2855)E/AndroidRuntime(10187): 	at android.app.ActivityThread.access$900(ActivityThread.java:181)E/AndroidRuntime(10187): 	at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1474)E/AndroidRuntime(10187): 	at android.os.Handler.dispatchMessage(Handler.java:102)
```

#### Processed => end-lind.log 
```
E/AndroidRuntime(10187): 	at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:2790)
E/AndroidRuntime(10187): 	at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:2855)
E/AndroidRuntime(10187): 	at android.app.ActivityThread.access$900(ActivityThread.java:181)
E/AndroidRuntime(10187): 	at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1474)
E/AndroidRuntime(10187): 	at android.os.Handler.dispatchMessage(Handler.java:102)
```
