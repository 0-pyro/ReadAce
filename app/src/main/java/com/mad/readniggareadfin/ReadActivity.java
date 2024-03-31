package com.mad.readniggareadfin;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.github.barteksc.pdfviewer.PDFView;

public class ReadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read);
        Bundle b = getIntent().getExtras();
        if(b!=null) {
            String t = b.getString("filename");
            PDFView pdf = findViewById(R.id.pdf);
            pdf.fromAsset(t).load();
        }
    }
}