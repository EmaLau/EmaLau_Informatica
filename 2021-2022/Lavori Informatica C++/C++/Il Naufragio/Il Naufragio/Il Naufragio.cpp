#include <iostream>
#include <string>
#include <chrono>
#include <thread>
#include <Windows.h>


using namespace std::chrono_literals;
using namespace std;

int main(){
    string scelta;
    string nome;
    string arma;
    string armas;
    string finale;
    string risposta;
    int g;
    int time;
    SetConsoleTitleA("Il Neufragio - Beta v0.01");

    cout << "Prima di iniziare con il gioco, inserisci il nome del protagonista" << endl;
    cin >> nome;
    this_thread::sleep_for(chrono::seconds(1));
    cout << "Prima di iniziare imposta il tempo di lettura tra una frase e l'altra, da mettere in secondi" << endl;
    cin >> time;
    cout << "Bene, Il nome del protagonista e' " << nome << " e il tempo di lettura impostato e' " << time << " Secondi" << endl;
    this_thread::sleep_for(chrono::seconds(time));
    cout << "Il nome che hai selezionato e' " << nome << ", adesso andiamo avanti" << endl;
    this_thread::sleep_for(chrono::seconds(time));
    cout << "Narratore: " << nome << " vede un corpo senza sensi vicino a una spiaggia lontana" << endl;
    this_thread::sleep_for(chrono::seconds(time));
    cout << nome << ": Accidenti, una ragazza sulla spiaggia chi sara' mai?" << endl;
    this_thread::sleep_for(chrono::seconds(1));
    cout << "Scrivi (a) per avvicinarti alla riva oppure (b) per far parlare lo zio" << endl;
    cin >> scelta;
    this_thread::sleep_for(chrono::seconds(1));
    if (scelta == "a")
        cout << "Narratore: " << nome << " si avvicina alla riva" << endl;
    else if (scelta == "b") {
        cout << "Zio Caronte: lasciala marcire lì, che sarà mai" << endl;
        this_thread::sleep_for(chrono::seconds(time));
        cout << "Narratore: " << nome << " si avvicina alla riva per vedere la ragazza e..." << endl;
    }
    this_thread::sleep_for(chrono::seconds(time));
    cout << "La ragazza: Aiuto, Aiuto!" << endl;
    this_thread::sleep_for(chrono::seconds(time));
    cout << "Il Narratore: La ragazza ha ripreso i sensi!" << endl;
    this_thread::sleep_for(chrono::seconds(time));
    cout << "Narratore: il ragazzo si avvicina per capire di piu'" << endl;
    this_thread::sleep_for(chrono::seconds(1));
    cout << "Se vuoi convincere tuo zio clicca (a) se invece vuoi andarla a salvare clicca (b)" << endl;
    cin >> scelta;
    this_thread::sleep_for(chrono::seconds(1));
    if (scelta == "a") {
        cout << nome << ": Dai zio, andiamo a vedere... non e' mai successa una cosa del genere!" << endl;
        this_thread::sleep_for(chrono::seconds(time));
        cout << "Zio Caronte: Va bene... ma ci parlerai tu! Non ho mai voluto visite in questo arcipelago." << endl;
    }
    else if (scelta == "b") {
        cout << "Narratore: Ignori tuo zio e vai ad avvicinarti alla ragazza." << endl;
    }
    this_thread::sleep_for(chrono::seconds(time));
    cout << "Narratore: sei arrivato a consolare la povera ragazza, e tutto d'un tratto dici..." << endl;
    this_thread::sleep_for(chrono::seconds(time));
    cout << nome << "Hey! Tutto bene? cos'e' successo? Che ci fai qui da sola in questo posto?" << endl;
    this_thread::sleep_for(chrono::seconds(time));
    cout << "Katherine: Stavo in yacht con la mia famiglia per una vacanza, poi tutto d'un tratto l'aliscafo ha sbattuto contro uno scoglio invisibile, a tratti... " << endl;
    this_thread::sleep_for(chrono::seconds(time/2));
    cout << "Katherine: Siamo tutti finiti in un vortice creato da questo scoglio, che pian piano sprofondava negli abissi creando un vuoto... e' successo dell'assurdo!" << endl;
    this_thread::sleep_for(chrono::seconds(time));
    cout << "Narratore: La ragazza ha vari accorgimenti di cose, persone che le mancano." << endl;
    this_thread::sleep_for(chrono::seconds(time));
    cout << "Katherine: Oddio! Mio padre, mia madre, i miei due fratelli... dove sono finiti?" << endl;
    this_thread::sleep_for(chrono::seconds(time));
    cout << "Narratore: In preda alla disperazione la ragazza scoppia in un mare di lacrime ma " << nome << " cerca di consolarla, avvicinandosi a lei, dicendole..." << endl;
    this_thread::sleep_for(chrono::seconds(time));
    cout << nome << ": Rilassati un nomento dimmi prima come ti chiami per iniziare a capirci, io sono" << nome << " e tu?" << endl;
    this_thread::sleep_for(chrono::seconds(time));
    cout << "Katherine: Io sono Katherine, piacere... mi potresti aiutare a ritrovare la mia famiglia?" << endl;
    this_thread::sleep_for(chrono::seconds(time));
    cout << nome << ": Certo!" << endl;
    this_thread::sleep_for(chrono::seconds(time));
    cout << "[Avvisti tuo zio che osserva " << nome << " con un'aria strana, di disprezzo verso il gesto nei confronti della ragazza" << endl;
    this_thread::sleep_for(chrono::seconds(1));
    cout << "Se vuoi chiedere a tuo zio cosa succede premi (a) mentre se lo vuoi ignorare e andare in un altro posto per parlare premi (b)" << endl;
    cin >> scelta;
    this_thread::sleep_for(chrono::seconds(1));
    if (scelta == "a") {
        cout << nome << ":  Zio, che succede? Cos’è quello sguardo?" << endl;
        this_thread::sleep_for(chrono::seconds(time));
        cout << "Zio Caronte: Non voglio altre persone oltre a noi in questo arcipelago! Non ti aspettare che accolga tale essere nel mio territorio!" << endl;
    }
    else if (scelta == "b") {

    }
    this_thread::sleep_for(chrono::seconds(time));
    cout << "Narratore: Lo zio se ne va e decide di recarsi in un altro posto per parlare più privatamente" << endl;
    this_thread::sleep_for(chrono::seconds(time));
    cout << "Narratore: I due vanno in casa del ragazzo a pochi metri dal punto di ritrovo." << endl;
    this_thread::sleep_for(chrono::seconds(time));
    cout << nome << ": Raccontami un po’ di come sei arrivata in yacht fino a queste acque." << endl;
    this_thread::sleep_for(chrono::seconds(time));
    cout << "Katherine: Per il mio compleanno siamo andati in yacht, mio padre ha voluto farmi una sorpresa… Ho 17 anni... Non capisco piu' niente, ricordo che dopo l’incidente la barca ha preso molta acqua, ci stavamo dirigendo a largo, giusto per festeggiare un po’." << endl;
    this_thread::sleep_for(chrono::seconds(time));
    cout << "Narratore: Dopo un momento di consolazione e intimita' “amichevole” la ragazza inizia a vivere nella sua dimora, per giorni, settimane, mesi… fino a quando una mattina la ragazza trova una lettera in una bottiglia di vetro, poggiata sulla baia dietro la casa e, in preda all’ansia la porta al protagonista per aprirla assieme…" << endl;
    this_thread::sleep_for(chrono::seconds(time));
    cout << "Katherine: " << nome << "! Ho trovato questa bottiglia portata dalla marea sulla spiaggia, qua dietro al cortile… ti va se la aprissimo assieme? Ho molta angoscia, vedo una lettera al suo interno… non ti sembra un po’ strano?" << endl;
    this_thread::sleep_for(chrono::seconds(time));
    cout << nome << ": Ovvio! Tranquilla, la apriamo. " << endl;
    this_thread::sleep_for(chrono::seconds(time));
    cout << "Narratore: Insieme tirano fuori la lettera, un po’ inumidita dal calore del sole che si concentrava nel vetro mentre era in viaggio." << endl;
    this_thread::sleep_for(chrono::seconds(time));
    cout << "Contenuto della lettera: HELP, an old man locked us up in a basement in the center of the archipelago and \n he's been feeding us for a week already, we are two people in the cell and we don't know which \n are the old man intentions, if you read this, please help us!!! " << endl;
    this_thread::sleep_for(chrono::seconds(time*2));
    cout << nome << ": Non conosco molto bene questa lingua, ma assomiglia molto all’inglese" << endl;
    this_thread::sleep_for(chrono::seconds(time));
    cout << "Katherine: Si, la parlo! E questa è la calligrafia di mia madre… Che cosa sta succedendo!?!?" << endl;
    this_thread::sleep_for(chrono::seconds(time));
    cout << nome << ": Aspetta, tu capisci quello che c’è scritto?" << endl;
    this_thread::sleep_for(chrono::seconds(time));
    cout << "Katherine: Ovvio! Dopotutto sono cresciuta in un Paese nel quale lo si parla." << endl;
    this_thread::sleep_for(chrono::seconds(time));
    cout << nome << ":E cosa c’e' scritto? " << endl;
    this_thread::sleep_for(chrono::seconds(time));
    cout << "Narratore: La ragazza gli traduce il testo tra lacrime di speranza e mezzi respiri." << endl;
    this_thread::sleep_for(chrono::seconds(time));
    cout << nome << ": Non avrei mai voluto sospettare ciò, ma penso parlino di mio zio… mi dice sempre che non gli piace la gente che viene nelle acque vicine all’arcipelago, ma non pensavo che potesse arrivare fino a questo punto." << endl;
    this_thread::sleep_for(chrono::seconds(time));
    cout << "Katherine: Ed ora che facciamo?" << endl;
    this_thread::sleep_for(chrono::seconds(1));
    cout << "Se vuoi andare a chiedere a tuo zio cosa sta succedendo premi (a), se vuoi andare di nascosto a salvare i genitori della ragazza premi (b)" << endl;
    cin >> scelta;
    this_thread::sleep_for(chrono::seconds(1));
    cout << "Se vuoi portare un'arma premi (a) se vuoi andare disarmato premi (b)" << endl;
    cin >> arma;
    this_thread::sleep_for(chrono::seconds(1));
    if (scelta == "a") {
        cout << nome << ": ehi zio cosa sta succedendo che cos’e' questa lettera che hanno scritto i genitori di Katherine chiedendo aiuto!?!? " << endl;
        this_thread::sleep_for(chrono::seconds(time));
        cout << "Zio Caronte: tsk… quei maledetti, beh ora che lo sai non ti posso più lasciare andare, tanto da quando i tuoi genitori sono morti e sei venuto a disturbarmi qui non vedevo l’ora di ucciderti qui sul MIO arcipelago." << endl;
        this_thread::sleep_for(chrono::seconds(time));
    }
    if (arma == "a") {
        cout << "Scegli se portare il coltello da cucina premi (a) oppure vuoi prendere l'ascia premi (b)" << endl;
        this_thread::sleep_for(chrono::seconds(1));
        cin >> armas;
        this_thread::sleep_for(chrono::seconds(time));
        cout << "Narratore: di nascosto ti incammini verso il sotterraneo al centro dell’isola se porti un’ascia, distruggi l'entrata della cella che però causa un rumore molto forte che allarma lo zio" << endl;
        this_thread::sleep_for(chrono::seconds(time));
        cout << "Zio Caronte: ehi cosa succede? che cosa ci fai lì? non ti devi avvicinare!";
        this_thread::sleep_for(chrono::seconds(time));
        cout << nome << ": cosa succede lo dico io! cosa vuol dire questa lettera d’aiuto che dice di venire qui? " << endl;
        this_thread::sleep_for(chrono::seconds(time));
        cout << "Zio Caronte: tsk… quei maledetti, beh ora che lo sai non ti posso più lasciare andare, tanto da quando i tuoi genitori sono morti e sei venuto a disturbarmi qui non vedevo l’ora di ucciderti qui sul MIO arcipelago." << endl;
        this_thread::sleep_for(chrono::seconds(time));
        if (armas == "a") {
            cout << "Narratore:sei forzato a combattere contro tuo zio, questo e un momento che deciderà il tuo fato, quindi rispondi a queste 5 domande attentamente per poter colpire tuo zio, hai 3 tentativi se sbagli incasserai colpi e morirai" << endl;
            this_thread::sleep_for(chrono::seconds(time));
            do{
                g = 0;
            cout << "prima domanda: In che anno e' stata scoperta l'america?" << endl;
            this_thread::sleep_for(chrono::seconds(time));
            cin >> risposta;

            if (risposta == "1492") {
                g++;
            }
            else {
                cout << "Errore" << endl;
            }
            this_thread::sleep_for(chrono::seconds(1));
            cout << "WIP" << endl;
            this_thread::sleep_for(chrono::seconds(1));
            cout << "WIP" << endl;
            this_thread::sleep_for(chrono::seconds(1));
            cout << "WIP" << endl;
            this_thread::sleep_for(chrono::seconds(1));
            cout << "WIP" << endl;
            } while (g != 1);
        }
        else if (armas == "b") {

            cout << "Narratore: sei forzato a combattere contro tuo zio, questo e un momento che deciderà il tuo fato, quindi rispondi a queste 3 domande attentamente per poter colpire tuo zio, hai 2 tentativi se sbagli incasserai colpi e morirai" << endl;
            this_thread::sleep_for(chrono::seconds(time));
            do {
                g = 0;
                cout << "question 1: what does QoS mean?" << endl;
                this_thread::sleep_for(chrono::seconds(time));
                cin >> risposta;
                this_thread::sleep_for(chrono::seconds(1));
                if (risposta == "Quality of service") {
                    g++;
                }
                else {
                    cout << "Error" << endl;
                }
                cout << "question 2: when did Dante Alighieri die?" << endl;
                this_thread::sleep_for(chrono::seconds(time));
                cin >> risposta;
                if (risposta == "1321") {
                    g++;
                }
                else {
                    cout << "Error" << endl;
                }
                this_thread::sleep_for(chrono::seconds(time));
                cout << "WIP" << endl;
                this_thread::sleep_for(chrono::seconds(time));
            } while (g != 2);

        }
        finale = "yes";
    }
    else if(arma=="b") {
        cout << "Narratore: tuo zio ti uccide e il giorno dopo uccide anche i genitori della ragazza, Katherine invece prova a scappare in mare ma nel tentativo muore anche lei" << endl;
        this_thread::sleep_for(chrono::seconds(time));

    }

    

    if(finale=="yes"){
    cout << "Narratore: Katherine arriva e vede il corpo di tuo zio e te che sei affaticato piangendo sul suo corpo chiedendoti il perchè di tutto questo" << endl;
    this_thread::sleep_for(chrono::seconds(time));
    cout << " Genitori di Katherine: Katherine!!! are you okay? " << endl;
    this_thread::sleep_for(chrono::seconds(time));
    cout << "Katherine: Mom, Dad! I’m okay! thanks to " << nome << " seems like you all are okay too! thanks god. Wait, where are my siblings?" << endl;
    this_thread::sleep_for(chrono::seconds(time));
    cout << "Madre Katherine: fortunately they escaped with the rescue group and went to the coast of florida." << endl;
    this_thread::sleep_for(chrono::seconds(time));
    cout << "Narratore: il padre si avvicina a te e ti dice " << endl;
    this_thread::sleep_for(chrono::seconds(time));
    cout << "Padre Katherine: Hey you little man I saw you saved us thank you, but who was that old man?" << endl;
    this_thread::sleep_for(chrono::seconds(time));
    cout << "Narratore: Katherine racconta tutto il successo e c’è un minuto di silenzio e di lutto. I genitori provano a consolarti con l’aiuto di katherine  ma a un certo punto il padre ti fa una domanda che deciderà il tuo futuro." << endl;
    this_thread::sleep_for(chrono::seconds(time));
    cout << "Padre Katherine: So "<<nome<<" what are you going to do now alone here, Won’t you feel lonely ? If you want I offer you to come to my place to live." << endl;
    this_thread::sleep_for(chrono::seconds(time));
    cout << "Narratore: katherine e sua madre sono molti sorpresi da questa offerta da parte del padre. Adesso è arrivata la scelta che deciderà il tuo futuro / la tua fine." << endl;
    this_thread::sleep_for(chrono::seconds(time));
    cout << "Katherine: Cosa farai?" << endl;
    this_thread::sleep_for(chrono::seconds(time));
    cout << "premi (a) se vuoi rimanere nell’isola da solo premi (b) se vuoi andare a vivere con la famiglia di katherine" << endl;
    this_thread::sleep_for(chrono::seconds(1));
    cin >> scelta;
    if (scelta == "a") {
        this_thread::sleep_for(chrono::seconds(time/2));
        cout << "Narrazione finale: la famiglia di katherine se ne va e te finisci per vivere indipendente nell’arcipelago come hai sempre fatto ma senza tuo zio. Dopo 3 anni decidi di trasferirti nella città natale di tuo zio in Messico. Vieni riconosciuto da persone strane a causa del tuo cognome per tuo zio, che era una persona di brutta reputazione con molti debiti. La malavita ti obbliga a ripagare i debiti a te ma non riesci e vieni ucciso" << endl;
    }
    else if(scelta=="b") {
        this_thread::sleep_for(chrono::seconds(time/2));
        cout << "Narrazione finale: vai a vivere insieme alla famiglia di katherine e inizi ad andare a scuola insieme a lei dopo un po’ di anni vai anche al college insieme a lei e finite per sposarvi" << endl;
    }


    }

}
//Betatester Improta