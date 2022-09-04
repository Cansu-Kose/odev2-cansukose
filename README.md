# odev2-cansukose

# The difference between eager and lazy
An eager algorithm executes immediately and returns a result. A lazy algorithm defers computation until it is necessary to execute and then produces a result.

Eager and lazy algorithms both have pros and cons. Eager algorithms are easier to understand and debug. They can also be highly optimized for a single use case 
(e.g. filter). Lazy algorithms sometimes result in less computation and if there are multiple steps in the computation(e.g.filter, map, reduce), there will be 
less temporary garbage created.

I usually prefer using eager algorithms by default, and lazy algorithms when I see an opportunity for an optimization. Both eager and lazy algorithms are useful 
so I always want both available in my toolkit.

Here’s a simple example showing eager initialization and lazy initialization.

# Eager Initialization

"""
class Someclass
{
    private final List<String> strings = new ArrayList<>();

    public List<String> getStrings()
    {
        return this.strings;
    }
}
"""

In the eager case, the List named strings is initialized immediately when an instance of SomeClass is created. This allows the variable strings to be defined as 
final as it will only ever be initialized when the instance of the of the class is created.

# Lazy Initialization

"""
class Someclass
{
    private List<String> strings;

    public List<String> getStrings()
    {
        if (this.strings == null)
        {
            this.strings = new ArrayList<>();
        }
        return this.strings;
    }
}
"""

In the lazy case, the List named strings is initialized only if the method getStrings is called. The computation required is deferred until the method is called. 
If the method is never called, then the extra computation is never required.
