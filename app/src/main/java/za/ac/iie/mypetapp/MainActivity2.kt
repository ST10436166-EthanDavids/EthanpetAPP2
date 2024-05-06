package za.ac.iie.mypetapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView




class MainActivity2: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val feedButton: Button = findViewById(R.id.feedBtn)
        val cleanButton: Button = findViewById(R.id.cleanBtn)
        val playButton: Button = findViewById(R.id.playBtn)
        val petImageView: ImageView = findViewById(R.id.Image1)

        feedButton.setOnClickListener {
            // Change pet's image to match feeding action
            petImageView.setImageResource(R.drawable.feedimg)
            // Update status values
            updateStatusValues("Fed")
        }

        cleanButton.setOnClickListener {
            // Change pet's image to match cleaning action
            petImageView.setImageResource(R.drawable.cleanimg)
            // Update status values
            updateStatusValues("Cleaned")
        }

        playButton.setOnClickListener {
            // Change pet's image to match playing action
            petImageView.setImageResource(R.drawable.playimg)
            // Update status values
            updateStatusValues("Played")
        }
    }

    private fun updateStatusValues(action: String) {
        // Update status values based on the action performed
        // This could involve updating hunger, health, cleanliness, etc.
        // Example: Update status values on a TextView

        val CleanCounter = findViewById<TextView>(R.id.cleanCounter)
        val FeedCounter = findViewById<TextView>(R.id.feedCounter)
        val PlayCounter = findViewById<TextView>(R.id.playCounter)

        fun updateStatusValues(action: String) {
            // Update status values based on the action
            when (action) {
                "Feed" -> {
                    var hungerLevel = 10
                    var cleanlinessLevel = 5
                    var happinessLevel = 10
                }

                "Clean" -> {
                    var cleanlinessLevel = 20
                    var happinessLevel = 5
                }

                "Play" -> {
                    var happinessLevel = 15
                    var hungerLevel = 5


                }
                }
                }
            }

        }








