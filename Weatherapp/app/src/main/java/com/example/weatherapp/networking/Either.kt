package com.example.weatherapp.networking

public sealed class Either<out V, out E>

public class OK<out S>(public val value:S) : Either<S, Nothing>(){

}