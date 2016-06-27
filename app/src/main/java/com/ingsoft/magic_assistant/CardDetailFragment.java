package com.ingsoft.magic_assistant;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.ingsoft.magic_assistant.data.Card;


public class CardDetailFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_discipline_detail, container, false);
        return view;
    }

    public void setDiscipline(Card card) {
        //((TextView)getView().findViewById(R.id.detalle)).setText(card.getText());

        ((TextView)getView().findViewById(R.id.detalle)).setText( card.getType() + card.getColorIdentity()+ card.getText() + card.getFlavor());


        //check info to show
        ((TextView)getView().findViewById(R.id.horariodetail)).setText(card.getRarity());
        //((TextView)getView().findViewById(R.id.precio)).setText(""+ card.getPrice());
       // ((TextView)getView().findViewById(R.id.leveldetail)).setText( card.getRarity());
        ((TextView)getView().findViewById(R.id.titulodetail)).setText(card.getName());
        //((ImageView)getView().findViewById(R.id.imagendedeportedetalle)).setImageResource(card.getLogoResId());
    }

}
