package utils;

public enum SortingType {
    cheap("От дешевых к дорогим"),
    expensive("От дорогих к дешевым"),
    popularity("Популярные"),
    novelty("Новинки"),
    action("Акционные"),
    rank("По рейтингу");

    private String value;

    SortingType(final String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}

