package it.fago.lambdapatterns.defender.adapter;

import java.util.function.Function;
import java.util.function.Supplier;

public interface Factory<T> extends Supplier<T>
{
   default T newInstance()
   {
    return get();
   }

   public static <T,P> Factory<T> createFactory(Function<P,T> cTor, P param)
   {
    return ()->cTor.apply(param);
   }   
}