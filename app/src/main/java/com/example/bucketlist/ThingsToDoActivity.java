package com.example.bucketlist;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class ThingsToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_do);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        setuplist();
    }

    private void setuplist() {
        BucketListEntry[] thingsToDo = {
                new BucketListEntry(
                        "Skydiving",
                        "Experience the thrill of jumping out of a plane!",
                        R.drawable.skydive,
                        3.2f
                ),
                new BucketListEntry(
                        "Scuba Diving in the Great Barrier Reef",
                        "Explore the underwater beauty of the world's largest coral reef.",
                        R.drawable.road_trip,
                        2.2f
                ),
                new BucketListEntry(
                        "Visit the Eiffel Tower",
                        "See the iconic landmark in Paris and enjoy breathtaking views.",
                        R.drawable.kilimanjaro,
                        4f
                ),
                new BucketListEntry(
                        "Hike Machu Picchu",
                        "Discover the ancient Incan city and its stunning surroundings.",
                        R.drawable.scubadive,
                        2.4f
                ),
                new BucketListEntry(
                        "Northern Lights",
                        "Witness the magical aurora borealis in Iceland or Norway.",
                        R.drawable.iceland,
                        1.9f
                ),
        };

        RecyclerView recyclerView = findViewById(R.id.recycler_view_things_to_do);
        BucketListEntryAdapter adapter = new BucketListEntryAdapter(thingsToDo);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onSupportNavigateUp() {
        getOnBackPressedDispatcher().onBackPressed();
        return true;
    }
}