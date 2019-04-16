package swe4.collections;

public class HashMap<K,V> {
    public HashMap(){}
    // Erzeugt eine HashMap mit einer initialen Größe von 11 und einem max. Lastfaktor von 0.75.
    public HashMap(int initialCapacity, float maxLoadFactor){}
    /*
    // Erzeugt eine HashMap mit der angegebenen Kapazität und dem angegebenen Lastfaktor.
    public V get(K key);
    // Gibt den mit key assoziierten Wert zurück. Falls key nicht in dieser Map nicht enthalten ist,
    // wird null retourniert.
    public boolean containsKey(K key);
    // Gibt true zurück, falls key in dieser Map enthalten ist.
    public boolean containsValue(V value);
    // Überprüft, ob in dieser Map ein Schlüssel existiert, der mit value assoziiert ist.
    public V put(K key, V value);
    // Assoziiert mit key ein neues Objekt value. Existiert kein Eintrag unter key, wird ein neuer
    // Eintrag hinzugefügt. Gibt den alten mit key assoziieren Wert zurück. Falls key nicht in dieser
    // Map nicht enthalten ist, wird null retourniert. Organisiert die Hashtabelle neu (rehash),
    // falls durch das Einfügen dieses Elements der maximale Lastfaktor überschritten wird.
    public boolean isEmpty();
    // Überprüft, ob diese Map leer ist.
    public V remove(K key);
    // Entfernt den Eintrag unter key. Gibt den Wert zurück, der mit key assoziiert war. Falls key
    // nicht in dieser Map enthalten ist, wird null retourniert.
    public void clear();
    // Entfernt alle Einträge dieser Map.
    public int size();
    // Gibt die Anzahl der Einträge zurück.
    public K[] keys();
    // Gibt alle in dieser Map gespeicherten Schlüssel als Feld zurück
    public V[] values();
    // Gibt alle in dieser Map gespeicherten Werte als Feld zurück.
    public Iterator<KeyValuePair<K,V>> iterator();
    // Liefert einen Iterator auf der Key/Value-Paare.
    public float getMaxLoadFactor();
    // Gibt den maximalen Lastfaktur zurück.
    public float getLoadFactor();
    // Gibt den aktuellen Lastfaktor zurück.
    public void rehash();
    // Vergrößert die Hashtabelle und reorganisiert die Einträge.
    */
}

