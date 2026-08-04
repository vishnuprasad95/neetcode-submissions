class TimeMap {
    class Pair {
        String value;
        int timestamp;

        Pair(String value, int timestamp) {
            this.value = value;
            this.timestamp = timestamp;
        }
    }
    Map<String, List<Pair>> map;

    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }

        map.get(key).add(new Pair(value, timestamp));
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key))
            return "";

        List<Pair> list = map.get(key);

        int low = 0;
        int high = list.size() - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (list.get(mid).timestamp <= timestamp) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans == -1 ? "" : list.get(ans).value;
    }
}
