SELECT "LEARNINGOUTCOMELIST"."TITLE", "LEARNINGOUTCOMELIST_1"."TITLE" FROM "ECVET_DRAFT"."PUBLIC"."LEARNINGOUTCOMELIST_LEARNINGOUTCOMELIST" AS "LEARNINGOUTCOMELIST_LEARNINGOUTCOMELIST", "ECVET_DRAFT"."PUBLIC"."LEARNINGOUTCOMELIST" AS "LEARNINGOUTCOMELIST", "ECVET_DRAFT"."PUBLIC"."LEARNINGOUTCOMELIST" AS "LEARNINGOUTCOMELIST_1" WHERE "LEARNINGOUTCOMELIST_LEARNINGOUTCOMELIST"."LEARNINGOUTCOMELISTPARENT_ID" = "LEARNINGOUTCOMELIST"."ID" AND "LEARNINGOUTCOMELIST_LEARNINGOUTCOMELIST"."LEARNINGOUTCOMELIST_ID" = "LEARNINGOUTCOMELIST_1"."ID"