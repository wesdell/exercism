import java.util.Map;
import java.util.HashMap;
import java.util.Objects;

public class DialingCodes {

    private Map<Integer, String> dialingCountryM = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return this.dialingCountryM;
    }

    public void setDialingCode(Integer code, String country) {
        this.dialingCountryM.put(code, country);
    }

    public String getCountry(Integer code) {
        return this.dialingCountryM.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if (!this.dialingCountryM.containsKey(code) && !this.dialingCountryM.containsValue(country)) {
            setDialingCode(code, country);
        }
    }

    public Integer findDialingCode(String country) {
        for (Map.Entry<Integer, String> item : this.dialingCountryM.entrySet()) {
            if (Objects.equals(item.getValue(), country)) {
                return item.getKey();
            }
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        if (this.dialingCountryM.containsValue(country)) {
            this.dialingCountryM.remove(findDialingCode(country));
            setDialingCode(code, country);
        }
    }
    
}
