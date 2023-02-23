package com.example.archi.service;

import com.example.archi.model.Tekateki;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class TekatekiServiceImp implements TekatekiService {

    public TekatekiServiceImp() {
        tekateki.add(new Tekateki(1L, "Dalam banyak-banyak nasi, nasi apa yang boleh bergerak?", "Nasi goreng pattaya"));
        tekateki.add(new Tekateki(2L, "Kenapa dalam helikopter panas?", "Kipas kat luar"));
        tekateki.add(new Tekateki(3L, "Apa dia bila kita baring, dia berdiri. Bila kita berdiri, dia baring?", "Tapak kaki"));
        tekateki.add(new Tekateki(4L, "Kalau kucing jantan jumpa kucing betina, dia cakap apa?", "Kucingta kamu"));
        tekateki.add(new Tekateki(5L, "Kenapa hari selasa wangi?", "Sebab semalam dia monday(mandi)"));
        tekateki.add(new Tekateki(6L, "Bila cawan pecah, baling kat mana?", "Kedah"));
        tekateki.add(new Tekateki(7L, "Peti apa yang takde susu dalam dia?", "Peti O Ais"));
        tekateki.add(new Tekateki(8L, "Kalau ikan tak boleh terbang, buaya tak boleh apa?", "Tak boleh hidup tanpa awak"));
        tekateki.add(new Tekateki(9L, "Dalam banyak-banyak beruk, beruk apa warna hijau?", "Brocolli(berukkoli)"));
    }

    List<Tekateki> tekateki = new ArrayList<Tekateki>();

    @Override
    public List<Tekateki> getTekateki() {
        return tekateki;
    }

    @Override
    public Tekateki getTekateki(Long id) {
        Iterator<Tekateki> iterator = getTekateki().iterator();
        while (iterator.hasNext()) {
            Tekateki tekateki = iterator.next();
            if (tekateki.getId().equals(id)) {
                return tekateki;
            }
        }
        return null;
    }

    public void createTekateki(Long id, String question, String answer) {
        tekateki.add(new Tekateki(id, question, answer));
    }

    public void updateTekateki(Tekateki tekateki) {
        getTekateki(tekateki.getId()).setQuestion(tekateki.getQuestion());
        getTekateki(tekateki.getId()).setAnswer(tekateki.getAnswer());
    }

    public void deleteTekateki(Long id){
        System.out.println("Status.." +tekateki.remove(getTekateki(id)));
    }
}
