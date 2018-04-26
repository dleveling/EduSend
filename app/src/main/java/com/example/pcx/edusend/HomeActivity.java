package com.example.pcx.edusend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    List<Book> lstBook;
    private Button BT_PF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        lstBook = new ArrayList<>();
        lstBook.add(new Book("The Test Book","ID : IdenID001","A Sci-Fi Book",R.drawable.img1));
        lstBook.add(new Book("Before We Were Yours: A Novel","ID : IdenID001","Memphis, 1939. Twelve-year-old Rill Foss and her four younger siblings live a magical life aboard their family’s Mississippi River shantyboat. But when their father must rush their mother to the hospital one stormy night, Rill is left in charge—until strangers arrive in force. Wrenched from all that is familiar and thrown into a Tennessee Children’s Home Society orphanage, the Foss children are assured that they will soon be returned to their parents—but they quickly realize the dark truth. At the mercy of the facility’s cruel director, Rill fights to keep her sisters and brother together in a world of danger and uncertainty.",R.drawable.before));
        lstBook.add(new Book("An American Princess","ID : IdenID001","Born to a pioneering family in Upstate New York in the late 1800s, Allene Tew was beautiful, impetuous, and frustrated by the confines of her small hometown. At eighteen, she met Tod Hostetter at a local dance, having no idea that the mercurial charmer she would impulsively wed was heir to one of the wealthiest families in America. But when he died twelve years later, Allene packed her bags for New York City. Never once did she look back.",R.drawable.princess));
        lstBook.add(new Book("Twisted Prey","ID : schooltech","A rich psychopath, Taryn Grant had run successfully for the U.S. Senate, where Lucas had predicted she'd fit right in. He was also convinced that she'd been responsible for three murders, though he'd never been able to prove it. Once a psychopath had gotten that kind of rush, though, he or she often needed another fix, so he figured he might be seeing her again.",R.drawable.twistedprey));
        lstBook.add(new Book("When Never Comes","ID : lolikon02","As a teenage runaway and child of an addict, Christy-Lynn learned the hard way that no address was permanent, and no promise sacred. For a while, she found a safe haven in her marriage to bestselling crime novelist Stephen Ludlow—until his car skidded into Echo Bay. But Stephen’s wasn’t the only body pulled from the icy waters that night. When details about a mysterious violet-eyed blonde become public, a media circus ensues, and Christy-Lynn runs again.",R.drawable.never));
        lstBook.add(new Book("Bandwidth","ID : schooltech03","A rising star at a preeminent political lobbying firm, Dag Calhoun represents the world’s most powerful technology and energy executives. But when a close brush with death reveals that the influence he wields makes him a target, impossible cracks appear in his perfect, richly appointed life.",R.drawable.bandwidth));
        lstBook.add(new Book("First 100 Words","ID : schooltech03","Your little one will soon learn some essential first words and pictures with this bright board book. There are 100 color photographs to look at and talk about, and 100 simple first words to read and learn, too. The pages are made from tough board for hours of fun reading, and the cover is softly padded for little hands to hold. ",R.drawable.first100words));
        lstBook.add(new Book("Giraffes Can't Dance","ID : tech03","Giraffes Can't Dance is a touching tale of Gerald the giraffe, who wants nothing more than to dance. With crooked knees and thin legs, it's harder for a giraffe than you would think. Gerald is finally able to dance to his own tune when he gets some encouraging words from an unlikely friend.",R.drawable.giraffescantdance));
        lstBook.add(new Book("Dummy","ID : Dummy","A Dummy Book",R.drawable.bookicon));
        lstBook.add(new Book("Dummy","ID : Dummy","A Dummy Book",R.drawable.bookicon));
        lstBook.add(new Book("Dummy","ID : Dummy","A Dummy Book",R.drawable.bookicon));
        lstBook.add(new Book("Dummy","ID : Dummy","A Dummy Book",R.drawable.bookicon));
        lstBook.add(new Book("Dummy","ID : Dummy","A Dummy Book",R.drawable.bookicon));
        lstBook.add(new Book("Dummy","ID : Dummy","A Dummy Book",R.drawable.bookicon));
        lstBook.add(new Book("Dummy","ID : Dummy","A Dummy Book",R.drawable.bookicon));
        lstBook.add(new Book("Dummy","ID : Dummy","A Dummy Book",R.drawable.bookicon));
        lstBook.add(new Book("Dummy","ID : Dummy","A Dummy Book",R.drawable.bookicon));
        lstBook.add(new Book("Dummy","ID : Dummy","A Dummy Book",R.drawable.bookicon));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstBook);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);
        //testGIT

        BT_PF = (Button)findViewById(R.id.BT_profile);

        BT_PF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfile();
            }
        });


    }

    public void openProfile(){
        Intent intent = new Intent(this,prifile_activity.class);
        startActivity(intent);
    }
}
