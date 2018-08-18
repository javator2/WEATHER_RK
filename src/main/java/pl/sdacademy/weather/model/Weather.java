package pl.sdacademy.weather.model;

public class Weather {
    private String id_stacji;
    private String stacja;
    private String data_pomiaru;
    private String godzina_pomiaru;
    private String temperatura;
    private String predkosc_wiatru;
    private String kierunek_wiatru;
    private String wilgotnosc_wzgledna;
    private String suma_opadu;
    private String cisnienie;

    //public Weather(){}
    public Weather(String id_stacji, String stacja, String data_pomiaru, String godzina_pomiaru, String temperatura, String predkosc_wiatru, String kierunek_wiatru, String wilgotnosc_wzgledna, String suma_opadu, String cisnienie) {
        this.id_stacji = id_stacji;
        this.stacja = stacja;
        this.data_pomiaru = data_pomiaru;
        this.godzina_pomiaru = godzina_pomiaru;
        this.temperatura = temperatura;
        this.predkosc_wiatru = predkosc_wiatru;
        this.kierunek_wiatru = kierunek_wiatru;
        this.wilgotnosc_wzgledna = wilgotnosc_wzgledna;
        this.suma_opadu = suma_opadu;
        this.cisnienie = cisnienie;
    }

    public String getId_stacji() {
        return id_stacji;
    }

    public void setId_stacji(String id_stacji) {
        this.id_stacji = id_stacji;
    }

    public String getStacja() {
        return stacja;
    }

    public void setStacja(String stacja) {
        this.stacja = stacja;
    }

    public String getData_pomiaru() {
        return data_pomiaru;
    }

    public void setData_pomiaru(String data_pomiaru) {
        this.data_pomiaru = data_pomiaru;
    }

    public String getGodzina_pomiaru() {
        return godzina_pomiaru;
    }

    public void setGodzina_pomiaru(String godzina_pomiaru) {
        this.godzina_pomiaru = godzina_pomiaru;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getPredkosc_wiatru() {
        return predkosc_wiatru;
    }

    public void setPredkosc_wiatru(String predkosc_wiatru) {
        this.predkosc_wiatru = predkosc_wiatru;
    }

    public String getKierunek_wiatru() {
        return kierunek_wiatru;
    }

    public void setKierunek_wiatru(String kierunek_wiatru) {
        this.kierunek_wiatru = kierunek_wiatru;
    }

    public String getWilgotnosc_wzgledna() {
        return wilgotnosc_wzgledna;
    }

    public void setWilgotnosc_wzgledna(String wilgotnosc_wzgledna) {
        this.wilgotnosc_wzgledna = wilgotnosc_wzgledna;
    }

    public String getSuma_opadu() {
        return suma_opadu;
    }

    public void setSuma_opadu(String suma_opadu) {
        this.suma_opadu = suma_opadu;
    }

    public String getCisnienie() {
        return cisnienie;
    }

    public void setCisnienie(String cisnienie) {
        this.cisnienie = cisnienie;
    }
}
