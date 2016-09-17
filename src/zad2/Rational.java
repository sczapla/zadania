/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad2;

public class Rational {

    private final int licznik;
    private final int mianownik;

    public Rational(int licznik, int mianownik) {
        this.licznik = licznik;
        this.mianownik = mianownik;
    }

    public Rational add(Rational arg) {
        if (this.compareTo(new Rational(0, 1)) == 0) {
            return arg;
        }
        if (arg.compareTo(new Rational(0, 1)) == 0) {
            return this;
        }

        int licznikRet = this.licznik * arg.mianownik + arg.licznik * this.mianownik;
        int mianownikRet = this.mianownik * arg.mianownik;
        return new Rational(licznikRet, mianownikRet);
    }

    public Rational mul(Rational arg) {
        return new Rational(this.licznik * arg.licznik,
                this.mianownik * arg.mianownik);
    }

    public Rational sub(Rational arg) {
        return this.add(arg.negacja());
    }

    public Rational div(Rational arg) {
        return this.mul(arg.odwrotnosc());
    }

    private Rational negacja() {
        return new Rational(-licznik, mianownik);
    }

    private Rational odwrotnosc() {
        return new Rational(mianownik, licznik);
    }

    public boolean equals(Rational arg) {
        if (arg == null) {
            return false;
        }
        if (arg.getClass() != this.getClass()) {
            return false;
        }
        return compareTo(arg) == 0;
    }

    public int compareTo(Rational arg) {
        int lhs = this.licznik * arg.mianownik;
        int rhs = this.mianownik * arg.licznik;
        if (lhs < rhs) {
            return -1;
        }
        if (lhs > rhs) {
            return +1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return licznik + "/" + mianownik;
    }
}
