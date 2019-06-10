package net.blay09.mods.kleeslabs.registry;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Nullable;
import java.util.Map;
import java.util.Set;

public class JsonCompatDataSlab {
    @SerializedName("modid")
    private String modId;

    private boolean silent;

    private String converter;

    private Set<String> slabs;

    @SerializedName("mapped_slabs")
    private Map<String, String> mappedSlabs;

    @SerializedName("pattern_search")
    private String patternSearch;

    @SerializedName("pattern_replace")
    private String patternReplace;

    @SerializedName("pattern_slabs")
    private Set<String> patternSlabs;

    public String getModId() {
        return modId;
    }

    public boolean isSilent() {
        return silent;
    }

    public String getConverter() {
        return converter;
    }

    @Nullable
    public Set<String> getSlabs() {
        return slabs;
    }

    @Nullable
    public Map<String, String> getMappedSlabs() {
        return mappedSlabs;
    }

    @Nullable
    public String getPatternSearch() {
        return patternSearch;
    }

    @Nullable
    public String getPatternReplace() {
        return patternReplace;
    }

    @Nullable
    public Set<String> getPatternSlabs() {
        return patternSlabs;
    }
}
