package pl.devcezz.stream;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MovieMain {

    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("Movie A", 4.7, Arrays.asList(Genre.COMEDY, Genre.ACTION), LocalDate.of(2019, 11, 3)),
                new Movie("Movie B", 3.7, Arrays.asList(Genre.ACTION, Genre.DRAMA), LocalDate.of(1998, 2, 4)),
                new Movie("Movie C", 2.1, Arrays.asList(Genre.DRAMA, Genre.FANTASY), LocalDate.of(2020, 9, 17)),
                new Movie("Movie D", 4.2, Arrays.asList(Genre.FANTASY, Genre.ACTION), LocalDate.of(2001, 4, 5)),
                new Movie("Movie E", 3.2, Arrays.asList(Genre.DRAMA, Genre.COMEDY), LocalDate.of(2010, 5, 25)),
                new Movie("Movie F", 1.9, Arrays.asList(Genre.COMEDY, Genre.FANTASY), LocalDate.of(2002, 1, 5)),
                new Movie("Movie G", 4.9, Arrays.asList(Genre.ACTION, Genre.HORROR), LocalDate.of(1957, 4, 10)),
                new Movie("Movie H", 2.3, Arrays.asList(Genre.HORROR, Genre.DRAMA), LocalDate.of(1968, 5, 11)),
                new Movie("Movie I", 2.7, Arrays.asList(Genre.HORROR, Genre.DRAMA), LocalDate.of(2001, 12, 19)),
                new Movie("Movie J", 3.9, Arrays.asList(Genre.ACTION, Genre.COMEDY), LocalDate.of(2003, 11, 29))
        );

        for (Movie movie : movies) {
            if (movie.getRating() > 4 && movie.getReleaseDate().isAfter(LocalDate.of(1999, 12, 31)) && movie.getGenres().contains(Genre.ACTION)) {
                System.out.println(movie.getName().toUpperCase());
            }
        }

        System.out.println("=====");

        movies.stream()
                .filter(movie -> movie.getRating() > 4)
                .filter(movie -> {
                    System.out.println(movie.getName());
                    return movie.getReleaseDate().isAfter(LocalDate.of(1999, 12, 31));
                })
                .filter(movie -> movie.getGenres().contains(Genre.ACTION))
                .map(movie -> movie.getName().toUpperCase())
                .count();

        System.out.println("=====");

        Stream<String> stream = Stream.of("abc", "def", "ghi");

        stream.forEach(System.out::println);

        System.out.println("=====");

        Optional<String> movieForToday = movies.stream()
                .filter(movie -> movie.getRating() > 4)
                .filter(movie -> movie.getReleaseDate().isAfter(LocalDate.of(1999, 12, 31)))
                .filter(movie -> movie.getGenres().contains(Genre.ACTION))
                .map(movie -> movie.getName().toUpperCase())
                .findAny();

        movieForToday.ifPresent(System.out::println);

        System.out.println("====");

        movies.forEach(System.out::println);

        System.out.println("====");

        Stream<String> streamMovies = movies.stream()
                .filter(movie -> movie.getRating() > 4)
                .filter(movie -> movie.getReleaseDate().isAfter(LocalDate.of(1999, 12, 31)))
                .filter(movie -> movie.getGenres().contains(Genre.ACTION))
                .map(movie -> movie.getName().toUpperCase());

//        streamMovies.findAny();
        streamMovies.findFirst();

        System.out.println("====");

        IntStream.rangeClosed(-10, 10)
                .filter(i -> i >= 0)
                .sorted()
                .limit(3)
                .forEach(System.out::println);
    }
}
