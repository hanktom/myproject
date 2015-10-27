package com.tom.movie;

import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome" );
        List<Movie> movies = Movie.getAllMovies();
        for (int i=1; i<=movies.size();i++){
        	Movie m = movies.get(i-1);
        	System.out.println(i+". "+m.getName());
        }
        Scanner input = new Scanner(System.in);
        int index = Integer.parseInt(input.nextLine());
        Movie movie = movies.get(index-1);
        List<Play> plays = movie.listPlays();
        
    }
}
