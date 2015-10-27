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
        int playIndex = Integer.parseInt(input.nextLine());
        Play play = plays.get(playIndex-1);
        System.out.print("請輸入欲購買的張數:");
        int num = Integer.parseInt(input.nextLine());
        List<Integer> tickets = play.reserve(num);
        System.out.println("票:"+tickets);
    }
}
