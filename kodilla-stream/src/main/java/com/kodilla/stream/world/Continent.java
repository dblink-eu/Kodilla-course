package com.kodilla.stream.world;

import java.util.*;

public final class Continent {
    private final String name;
    private final Set<Country> countries = new HashSet<>();

    public Continent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addCountry(Country country) {
        if (country==null) {
            throw new IllegalArgumentException();
        }
        countries.add(country);
    }

    public List<Country> getCountries() {
        return new ArrayList<>(countries);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return Objects.equals(name, continent.name) &&
                Objects.equals(countries, continent.countries);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, countries);
    }

    @Override
    public String toString() {
        return "Continent{" +
                "name='" + name + '\'' +
                ", countries=" + countries +
                '}';
    }
}
