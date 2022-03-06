package mycode.model;

public class Film {

    private int id;
    private String nume;
    private String gen;
    private String durata;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public String getDurata() {
        return durata;
    }

    public void setDurata(String durata) {
        this.durata = durata;
    }


    public Film(int id, String nume, String gen, String durata) {
        this.id = id;
        this.nume = nume;
        this.gen = gen;
        this.durata = durata;
    }

    public Film(String prp){

        String [] v = prp.split(",");
        id = Integer.parseInt(v[0]);
        nume = v[1];
        gen = v[2];
        durata = v[3];
    }

    @Override
    public String toString(){

        return id + "," + nume + "," + gen + "," + durata;
    }

    @Override
    public boolean equals(Object o){

        Film f = (Film) o;
        return this.id == f.id;
    }
}
