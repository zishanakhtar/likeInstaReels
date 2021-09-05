# likeInstaReels
This code will open the Instagram android app, login, move to the reels section and play and like all the reels.
Reel will play for 10 seconds and scroll to the next one.
You need to have java, node.js, appium and android sdk and platform tools installed.
Any IDE like VS Code or Eclipse to run the code.
In BaseClass.java you need to provide the udid of your android device.
In LikeReels.java you need to provide the username and password of the Instagram acccount you'll be using.
Time duration for each reel to play can also be set in LikeReels.java in the while.
Currently it's an infinite loop, i.e, reels will keep on playing until you manually stop it. You can set the number of reels you want to play with the variable noOfReelsLiked.
To run the code, run testng.xml file as TestNG Suite.
