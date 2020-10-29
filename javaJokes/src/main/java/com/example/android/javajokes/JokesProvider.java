package com.example.android.javajokes;

import java.util.concurrent.ThreadLocalRandom;

public class JokesProvider {

    //jokes reference : https://www.ducksters.com/jokes/silly.php

    String[] jokesArray = {"Q: What goes up and down but does not move?\n\n" +
            "A: Stairs","Q: Where should a 500 pound alien go?\n\n" +
            "A: On a diet","Q: What did one toilet say to the other?\n\n" +
            "A: You look a bit flushed.","Q: Why did the picture go to jail?\n\n" +
            "A: Because it was framed.","Q: What did one wall say to the other wall?\n\n" +
            "A: I'll meet you at the corner.","Q: What did the paper say to the pencil?\n\n" +
            "A: Write on!","Q: What do you call a boy named Lee that no one talks to?\n\n" +
            "A: Lonely","Q: What gets wetter the more it dries?\n\n" +
            "A: A towel.","Q: Why do bicycles fall over?\n\n" +
            "A: Because they are two-tired!","Q: Why do dragons sleep during the day?\n\n" +
            "A: So they can fight knights!","Q: What did Cinderella say when her photos did not show up?\n\n" +
            "A: Someday my prints will come!","Q: Why was the broom late?\n\n" +
            "A: It over swept!","Q: What part of the car is the laziest?\n\n" +
            "A: The wheels, because they are always tired!","Q: What did the stamp say to the envelope?\n\n" +
            "A: Stick with me and we will go places!","Q: What is blue and goes ding dong?\n\n" +
            "A: An Avon lady at the North Pole!"};

    public String getJoke() {

        int randomJokesNumber = ThreadLocalRandom.current().nextInt(0,14);

        return jokesArray[randomJokesNumber] ;
    }
}

