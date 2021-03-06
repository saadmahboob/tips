package tips;


import briefj.collections.Counter;




/**
 * A Continuous time Markov chain.
 * 
 * @author Alexandre Bouchard (alexandre.bouchard@gmail.com)
 *
 * @param <S> The type of the states
 */
public interface Process<S>
{
  /**
   * The rates of departure from the given point (i.e. the non-zero
   * off-diagonal entries of the rate matrix).
   * 
   * Important: the returned object will be modified, so do not 
   * reuse the same return value across calls.
   * 
   * @param point
   * @return
   */
  public Counter<S> rates(S point);
}