package com.example.bucketlist;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class PlacesToGoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_to_go);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        setuplist();

    }

    private void setuplist() {
        BucketListEntry[] PlacesToGo = {
                new BucketListEntry(
                        "Safari in Africa",
                        "Experience wildlife up close in the Serengeti or Kruger National Park.",
                        R.drawable.kerala,
                        3.7f
                ),
                new BucketListEntry(
                        "Learn to Surf",
                        "Ride the waves in Hawaii or Australia and master surfing.",
                        R.drawable.japan,
                        2.5f
                ),
                new BucketListEntry(
                        "Hot Air Balloon Ride",
                        "Soar above the landscapes in Cappadocia or Napa Valley.",
                        R.drawable.iceland,
                        4.3f
                ),
                new BucketListEntry(
                        "Explore the Amazon Rainforest",
                        "Immerse yourself in the world's largest tropical rainforest.",
                        R.drawable.vietnam,
                        5.0f
                ),
                new BucketListEntry(
                        "Visit the Pyramids of Giza",
                        "Marvel at the ancient Egyptian pyramids and their history.",
                        R.drawable.northern_lights,
                        8.5f
                )
        };
        RecyclerView recyclerView = findViewById(R.id.recycler_view_places_to_go);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(PlacesToGo);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onSupportNavigateUp() {
        getOnBackPressedDispatcher().onBackPressed();
        return true;
    }
}