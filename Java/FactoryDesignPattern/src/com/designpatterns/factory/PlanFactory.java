package com.designpatterns.factory;

import java.util.function.Supplier;

import static java.util.Objects.requireNonNull;

/**
 * Created by Chethan on 12/04/17.
 */
public enum PlanFactory {
    // Registering Classes with keyword to be used at runtime
    Commercial(CommercialPlan::new),
    Domestic(DomesticPlan::new),
    Institutional(InstitutionalPlan::new);

    public final Supplier<Plan> factory;
    private PlanFactory(Supplier<Plan> factory) {
        this.factory = requireNonNull(factory);
    }
}
