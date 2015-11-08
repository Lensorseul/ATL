import com.pauware.pauware_engine._Core.*;
import com.pauware.pauware_engine._Exception.*;
import com.pauware.pauware_engine._Java_EE.*;
import java.util.Scanner;

public class VoitureJava {
    AbstractStatechart_monitor _Voiture;
    AbstractStatechart _Arret;
    AbstractStatechart _Marche;
    AbstractStatechart _MoinsVite;
    AbstractStatechart _PlusVite;
    AbstractStatechart _Maximum;

    private void init_structure() throws Statechart_exception {
    }

    private void init_behavior() throws Statechart_exception {
    _Arret = new Statechart("Arret");
    _MoinsVite = new Statechart("MoinsVite");
    _MoinsVite.doActivity(this,"MoinsViteActivity");
    _PlusVite = new Statechart("PlusVite");
    _PlusVite.doActivity(this,"PlusViteActivity");
    _Maximum = new Statechart("Maximum");
    _Maximum.doActivity(this,"MaximumActivity");
    _PlusVite.inputState();
    _Arret.inputState();